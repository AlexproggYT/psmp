
package net.mcreator.pookie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SaphireItem extends Item {
	public SaphireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
