
package net.mcreator.pookie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.pookie.init.PookieModItems;

public class OpalSwordItem extends SwordItem {
	public OpalSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2053;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 25f;
			}

			public int getLevel() {
				return 9;
			}

			public int getEnchantmentValue() {
				return 63;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PookieModItems.OPAL.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
