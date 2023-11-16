
package net.mcreator.pookie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.pookie.init.PookieModItems;

public class AlexandriteHoeItem extends HoeItem {
	public AlexandriteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2182;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 9;
			}

			public int getEnchantmentValue() {
				return 66;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PookieModItems.ALEXANDRITE.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
