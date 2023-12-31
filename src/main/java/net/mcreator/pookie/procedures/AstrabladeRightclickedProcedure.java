package net.mcreator.pookie.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.mcreator.pookie.init.PookieModEntities;
import net.mcreator.pookie.entity.StarEntity;

public class AstrabladeRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean cooldown = false;
		if (cooldown == false) {
			cooldown = true;
			for (int index0 = 0; index0 < 150; index0++) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new StarEntity(PookieModEntities.STAR.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 5, 1, (byte) 100);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 3);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
			cooldown = false;
		}
	}
}
