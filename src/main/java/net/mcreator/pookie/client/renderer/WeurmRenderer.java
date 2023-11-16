
package net.mcreator.pookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.pookie.entity.WeurmEntity;
import net.mcreator.pookie.client.model.Modelweurm;

public class WeurmRenderer extends MobRenderer<WeurmEntity, Modelweurm<WeurmEntity>> {
	public WeurmRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweurm(context.bakeLayer(Modelweurm.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeurmEntity entity) {
		return new ResourceLocation("pookie:textures/entities/weurm.png");
	}
}
