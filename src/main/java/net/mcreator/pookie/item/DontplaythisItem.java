
package net.mcreator.pookie.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DontplaythisItem extends RecordItem {
	public DontplaythisItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pookie:hi")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 12140);
	}
}
