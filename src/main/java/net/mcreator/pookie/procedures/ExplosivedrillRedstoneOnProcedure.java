package net.mcreator.pookie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class ExplosivedrillRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double timescalled = 0;
		for (int index0 = 0; index0 < 30; index0++) {
			timescalled = timescalled + 1;
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y + timescalled), z, 8, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y - timescalled), z, 8, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + timescalled), y, z, 8, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - timescalled), y, z, 8, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, (z + timescalled), 8, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, (z - timescalled), 8, Level.ExplosionInteraction.TNT);
		}
	}
}
