
package net.mcreator.pookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.pookie.entity.GreenweurmEntity;
import net.mcreator.pookie.client.model.Modelweurm;

public class GreenweurmRenderer extends MobRenderer<GreenweurmEntity, Modelweurm<GreenweurmEntity>> {
	public GreenweurmRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweurm(context.bakeLayer(Modelweurm.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreenweurmEntity entity) {
		return new ResourceLocation("pookie:textures/entities/greenweurm.png");
	}
}
