
package net.mcreator.pookie.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.pookie.procedures.ParalysisOnEffectActiveTickProcedure;

public class ParalysisMobEffect extends MobEffect {
	public ParalysisMobEffect() {
		super(MobEffectCategory.HARMFUL, -13108);
	}

	@Override
	public String getDescriptionId() {
		return "effect.pookie.paralysis";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ParalysisOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
