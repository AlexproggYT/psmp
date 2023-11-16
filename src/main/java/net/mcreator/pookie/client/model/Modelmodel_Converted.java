package net.mcreator.pookie.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmodel_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("pookie", "modelmodel_converted"), "main");
	public final ModelPart head;

	public Modelmodel_Converted(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(16, 17).addBox(5.0F, -22.0F, -13.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 7).addBox(5.0F, -20.0F, -13.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 7)
						.addBox(9.0F, -20.0F, -13.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 7).addBox(9.0F, -20.0F, -13.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 21)
						.addBox(5.0F, -19.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 18).addBox(5.0F, -18.0F, -13.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 21)
						.addBox(10.0F, -19.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(11.0F, -21.0F, -13.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(4.0F, -21.0F, -13.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 9).addBox(6.0F, -19.0F, -12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 6)
						.addBox(9.0F, -19.0F, -12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(7.0F, -20.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, -3)
						.addBox(12.0F, -19.0F, -13.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, -3).addBox(4.0F, -19.0F, -13.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, -3)
						.addBox(8.0F, -22.0F, -13.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, -3).addBox(7.0F, -22.0F, -13.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 15)
						.addBox(4.0F, -19.0F, -6.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 15).addBox(7.0F, -22.0F, -6.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 15)
						.addBox(8.0F, -22.0F, -6.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 16.0F, 8.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
