
package net.mcreator.pookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.pookie.entity.OnioncreeperEntity;

public class OnioncreeperRenderer extends MobRenderer<OnioncreeperEntity, CreeperModel<OnioncreeperEntity>> {
	public OnioncreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OnioncreeperEntity entity) {
		return new ResourceLocation("pookie:textures/entities/meloncreeper.png");
	}
}
