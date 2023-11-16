
package net.mcreator.pookie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlackironItem extends Item {
	public BlackironItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
