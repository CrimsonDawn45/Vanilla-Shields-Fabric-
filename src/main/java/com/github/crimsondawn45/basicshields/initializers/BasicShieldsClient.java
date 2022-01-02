package com.github.crimsondawn45.basicshields.initializers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.ShieldEntityModel;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.util.Identifier;

@SuppressWarnings("deprecation")
public class BasicShieldsClient implements ClientModInitializer {

    //Vanilla
    public static final EntityModelLayer wooden_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "wooden_shield"),"main");
    public static final EntityModelLayer golden_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "golden_shield"),"main");
    public static final EntityModelLayer diamond_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "diamond_shield"),"main");
    public static final EntityModelLayer netherite_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "netherite_shield"),"main");

    //Techreborn
    public static final EntityModelLayer bronze_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "bronze_shield"),"main");
    public static final EntityModelLayer ruby_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "ruby_shield"),"main");
    public static final EntityModelLayer peridot_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "peridot_shield"),"main");
    public static final EntityModelLayer sapphire_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "sapphire_shield"),"main");

    //Adabranium
    public static final EntityModelLayer nether_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "nether_shield"),"main");
    public static final EntityModelLayer vibranium_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "vibranium_shield"),"main");
    public static final EntityModelLayer adamantium_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "adamantium_shield"),"main");

    //Gobber
    public static final EntityModelLayer gobber_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "gobber_shield"),"main");
    public static final EntityModelLayer gobber_nether_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "gobber_nether_shield"),"main");
    public static final EntityModelLayer gobber_end_shield_model_layer = new EntityModelLayer(new Identifier(BasicShields.MOD_ID, "gobber_end_shield"),"main");

    @Override
    public void onInitializeClient() {

        /**
         * Vanilla
         */
        if(BasicShields.vanilla.isLoaded()) {

            //Wooden
            EntityModelLayerRegistry.registerModelLayer(wooden_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base_nopattern"));
            });

            //Golden
            EntityModelLayerRegistry.registerModelLayer(golden_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/golden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/golden_shield_base_nopattern"));
            });

            //Diamond
            EntityModelLayerRegistry.registerModelLayer(diamond_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/diamond_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/diamond_shield_base_nopattern"));
            });

            //Netherite
            EntityModelLayerRegistry.registerModelLayer(netherite_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/netherite_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/netherite_shield_base_nopattern"));
            });
        }

        /**
         * Techreborn
         */
        if(BasicShields.techReborn.isLoaded()) {

            //Bronze
            EntityModelLayerRegistry.registerModelLayer(bronze_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/bronze_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/bronze_shield_base_nopattern"));
            });

            //Ruby
            EntityModelLayerRegistry.registerModelLayer(ruby_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/ruby_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/ruby_shield_base_nopattern"));
            });

            //Peridot
            EntityModelLayerRegistry.registerModelLayer(peridot_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/peridot_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/peridot_shield_base_nopattern"));
            });

            //Sapphire
            EntityModelLayerRegistry.registerModelLayer(sapphire_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/sapphire_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/sapphire_shield_base_nopattern"));
            });
		}

        //TODO: this is temorarily using wood textures until others are done fix later.

        /**
         * Adabranium
         */
        if(BasicShields.adabranium.isLoaded()) {

            //Nether
            EntityModelLayerRegistry.registerModelLayer(nether_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base_nopattern"));
            });

            //Vibranium
            EntityModelLayerRegistry.registerModelLayer(vibranium_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base_nopattern"));
            });

            //Adamantium
            EntityModelLayerRegistry.registerModelLayer(adamantium_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base_nopattern"));
            });

        }


        /**
         * Gobber
         */
        if(BasicShields.gobber.isLoaded()) {

            //Gobber
            EntityModelLayerRegistry.registerModelLayer(gobber_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base_nopattern"));
            });

            //Gobber_nether
            EntityModelLayerRegistry.registerModelLayer(gobber_nether_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base_nopattern"));
            });

            //Gobber_end
            EntityModelLayerRegistry.registerModelLayer(gobber_end_shield_model_layer, ShieldEntityModel::getTexturedModelData);

            ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base"));
                registry.register(new Identifier(BasicShields.MOD_ID, "entity/wooden_shield_base_nopattern"));
            });
        }
    }
}