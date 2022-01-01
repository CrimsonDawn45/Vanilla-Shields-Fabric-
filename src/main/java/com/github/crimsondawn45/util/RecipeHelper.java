package com.github.crimsondawn45.util;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

public class RecipeHelper {

    public static JsonObject createShieldRecipe(Identifier CraftingItemIdentifier, boolean isTag, Identifier output) {
		String itemType;

		if(isTag) {
			itemType = "tag";
		} else {
			itemType = "item";
		}

		return createShapedRecipe(
			//Keys
			Lists.newArrayList('#','i'),
			//Items
			Lists.newArrayList(ItemTags.PLANKS.getId(), CraftingItemIdentifier), 
			//Types
			Lists.newArrayList("tag", itemType),
			//Pattern
			Lists.newArrayList(
				"#i#",
				"###",
				" # "
			),
			//Output
			output, 1);
	}

    //TODO: make method "createRecipeAdvancementJson"

	public static JsonObject createShapedRecipe(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, int count) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a shaped recipe.
        json.addProperty("type", "minecraft:crafting_shaped");
        //This creates:
        //"type": "minecraft:crafting_shaped"
 
        //We create a new Json Element, and add our crafting pattern to it.
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(pattern.get(0));
        jsonArray.add(pattern.get(1));
        jsonArray.add(pattern.get(2));
        //Then we add the pattern to our json object.
        json.add("pattern", jsonArray);
        //This creates:
        //"pattern": [
        //  "###",
        //  " | ",
        //  " | "
        //]
 
        //Next we need to define what the keys in the pattern are. For this we need different JsonObjects per key definition, and one main JsonObject that will contain all of the defined keys.
        JsonObject individualKey; //Individual key
        JsonObject keyList = new JsonObject(); //The main key object, containing all the keys
 
        for (int i = 0; i < keys.size(); ++i) {
            individualKey = new JsonObject();
            individualKey.addProperty(type.get(i), items.get(i).toString()); //This will create a key in the form "type": "input", where type is either "item" or "tag", and input is our input item.
            keyList.add(keys.get(i) + "", individualKey); //Then we add this key to the main key object.
            //This will add:
            //"#": { "tag": "c:copper_ingots" }
            //and after that
            //"|": { "item": "minecraft:sticks" }
            //and so on.
        }
 
        json.add("key", keyList);
        //And so we get:
        //"key": {
        //  "#": {
        //    "tag": "c:copper_ingots"
        //  },
        //  "|": {
        //    "item": "minecraft:stick"
        //  }
        //},
 
        //Finally, we define our result object
        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", count);
        json.add("result", result);
        //This creates:
        //"result": {
        //  "item": "modid:copper_pickaxe",
        //  "count": 1
        //}
 
        return json;
    }
    public static JsonObject createSmithingRecipe(Identifier inputId, boolean isInputTag, Identifier additionId, boolean isAdditionTag, Identifier outputId) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();

        //The "type" of the recipe we are creating. In this case, a smithing recipe.
        json.addProperty("type", "minecraft:smithing");
        //This creates
        //"type":"minecraft:smithing"

        /**
         * * Create "base" object contains original item
         */
        JsonObject base = new JsonObject();

        if(isInputTag) {
            base.addProperty("tag", inputId.toString());
        } else {
            base.addProperty("item", inputId.toString());
        }
            //Add "base" object
        json.add("base", base);
        //This creates
        //"base":{
        //      "item": "minecraft:stick"
        //}

        /**
         * *Create "addition" object contains additive
         */
        JsonObject addition = new JsonObject();

        if(isInputTag) {
            addition.addProperty("tag", additionId.toString());
        } else {
            addition.addProperty("item", additionId.toString());
        }
            //Add "addition" object
        json.add("addition", addition);
        //This creates
        //"base":{
        //      "item": "minecraft:stick"
        //}


        /**
         * *Create "result" object contains result
         */
        JsonObject result = new JsonObject();
        result.addProperty("item", outputId.toString());

            //Add "result" object
        json.add("result", result);

        return json;
    }
}
