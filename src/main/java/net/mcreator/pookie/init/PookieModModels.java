
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pookie.client.model.Modelweurm;
import net.mcreator.pookie.client.model.Modelwelcometohellmotherfucker;
import net.mcreator.pookie.client.model.Modelratt;
import net.mcreator.pookie.client.model.Modelmodel_Converted;
import net.mcreator.pookie.client.model.Modelarrow;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PookieModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelratt.LAYER_LOCATION, Modelratt::createBodyLayer);
		event.registerLayerDefinition(Modelweurm.LAYER_LOCATION, Modelweurm::createBodyLayer);
		event.registerLayerDefinition(Modelarrow.LAYER_LOCATION, Modelarrow::createBodyLayer);
		event.registerLayerDefinition(Modelwelcometohellmotherfucker.LAYER_LOCATION, Modelwelcometohellmotherfucker::createBodyLayer);
		event.registerLayerDefinition(Modelmodel_Converted.LAYER_LOCATION, Modelmodel_Converted::createBodyLayer);
	}
}
