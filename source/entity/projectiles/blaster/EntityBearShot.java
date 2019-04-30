package net.tslat.aoa3.entity.projectiles.blaster;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.tslat.aoa3.entity.projectiles.staff.BaseEnergyShot;
import net.tslat.aoa3.item.weapon.EnergyProjectileWeapon;

public class EntityBearShot extends BaseEnergyShot {
	public EntityBearShot(World world) {
		super(world);
	}

	public EntityBearShot(EntityLivingBase shooter, EnergyProjectileWeapon weapon, int maxAge) {
		super(shooter, weapon, maxAge);
	}

	public EntityBearShot(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	@Override
	public float getGravityVelocity() {
		return 0.4f;
	}
}