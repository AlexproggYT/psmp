
package net.mcreator.pookie.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class PedrohgfdItem extends RecordItem {
	public PedrohgfdItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pookie:pedro")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3740);
	}
}
