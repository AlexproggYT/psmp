
package net.mcreator.pookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.pookie.entity.FragmentEntity;

public class FragmentRenderer extends HumanoidMobRenderer<FragmentEntity, HumanoidModel<FragmentEntity>> {
	public FragmentRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new EyesLayer<FragmentEntity, HumanoidModel<FragmentEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("pookie:textures/entities/fb61d94a37534f64.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FragmentEntity entity) {
		return new ResourceLocation("pookie:textures/entities/fb61d94a37534f64.png");
	}
}
