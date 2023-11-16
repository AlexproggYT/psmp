
package net.mcreator.pookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.pookie.entity.PinkwomEntity;
import net.mcreator.pookie.client.model.Modelweurm;

public class PinkwomRenderer extends MobRenderer<PinkwomEntity, Modelweurm<PinkwomEntity>> {
	public PinkwomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweurm(context.bakeLayer(Modelweurm.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(PinkwomEntity entity) {
		return new ResourceLocation("pookie:textures/entities/pinkwom.png");
	}
}
