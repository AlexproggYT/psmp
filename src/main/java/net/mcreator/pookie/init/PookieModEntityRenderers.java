
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.pookie.client.renderer.WeurmRenderer;
import net.mcreator.pookie.client.renderer.StarRenderer;
import net.mcreator.pookie.client.renderer.PinkwomRenderer;
import net.mcreator.pookie.client.renderer.OnioncreeperRenderer;
import net.mcreator.pookie.client.renderer.GreenweurmRenderer;
import net.mcreator.pookie.client.renderer.FragmentRenderer;
import net.mcreator.pookie.client.renderer.EchoremnantRenderer;
import net.mcreator.pookie.client.renderer.DecimatorRenderer;
import net.mcreator.pookie.client.renderer.BlueweurmRenderer;
import net.mcreator.pookie.client.renderer.AlbinowomRenderer;
import net.mcreator.pookie.client.renderer.AlbinoratRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PookieModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PookieModEntities.WEURM.get(), WeurmRenderer::new);
		event.registerEntityRenderer(PookieModEntities.ALBINORAT.get(), AlbinoratRenderer::new);
		event.registerEntityRenderer(PookieModEntities.STAR.get(), StarRenderer::new);
		event.registerEntityRenderer(PookieModEntities.ONIONCREEPER.get(), OnioncreeperRenderer::new);
		event.registerEntityRenderer(PookieModEntities.BLUEWEURM.get(), BlueweurmRenderer::new);
		event.registerEntityRenderer(PookieModEntities.GREENWEURM.get(), GreenweurmRenderer::new);
		event.registerEntityRenderer(PookieModEntities.ALBINOWOM.get(), AlbinowomRenderer::new);
		event.registerEntityRenderer(PookieModEntities.PINKWOM.get(), PinkwomRenderer::new);
		event.registerEntityRenderer(PookieModEntities.ECHOREMNANT.get(), EchoremnantRenderer::new);
		event.registerEntityRenderer(PookieModEntities.ECHOREMNANT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PookieModEntities.FRAGMENT.get(), FragmentRenderer::new);
		event.registerEntityRenderer(PookieModEntities.DECIMATOR.get(), DecimatorRenderer::new);
	}
}
