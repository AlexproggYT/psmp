
package net.mcreator.pookie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.pookie.init.PookieModItems;

public class BlackironAxeItem extends AxeItem {
	public BlackironAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2719;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 48f;
			}

			public int getLevel() {
				return 11;
			}

			public int getEnchantmentValue() {
				return 77;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PookieModItems.BLACKIRON.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
