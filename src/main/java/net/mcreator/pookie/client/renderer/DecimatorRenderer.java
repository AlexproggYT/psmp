
package net.mcreator.pookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.pookie.entity.DecimatorEntity;
import net.mcreator.pookie.client.model.Modelwelcometohellmotherfucker;

public class DecimatorRenderer extends MobRenderer<DecimatorEntity, Modelwelcometohellmotherfucker<DecimatorEntity>> {
	public DecimatorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwelcometohellmotherfucker(context.bakeLayer(Modelwelcometohellmotherfucker.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DecimatorEntity entity) {
		return new ResourceLocation("pookie:textures/entities/untitled.png");
	}
}
