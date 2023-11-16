
package net.mcreator.pookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.pookie.entity.AlbinoratEntity;
import net.mcreator.pookie.client.model.Modelratt;

public class AlbinoratRenderer extends MobRenderer<AlbinoratEntity, Modelratt<AlbinoratEntity>> {
	public AlbinoratRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelratt(context.bakeLayer(Modelratt.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoratEntity entity) {
		return new ResourceLocation("pookie:textures/entities/ratt.png");
	}
}
