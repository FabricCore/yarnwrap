package yarnwrap.entity.vehicle;
public class FurnaceMinecartEntity { public net.minecraft.entity.vehicle.FurnaceMinecartEntity wrapperContained; public FurnaceMinecartEntity(net.minecraft.entity.vehicle.FurnaceMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public double pushZ() { return wrapperContained.pushZ; }
public void pushZ(double value) { wrapperContained.pushZ = value; }
// public static double pushZ() { return net.minecraft.entity.vehicle.FurnaceMinecartEntity.pushZ; }
// public static void pushZ(double value, ) { net.minecraft.entity.vehicle.FurnaceMinecartEntity.pushZ = value; }

public double pushX() { return wrapperContained.pushX; }
public void pushX(double value) { wrapperContained.pushX = value; }
// public static double pushX() { return net.minecraft.entity.vehicle.FurnaceMinecartEntity.pushX; }
// public static void pushX(double value, ) { net.minecraft.entity.vehicle.FurnaceMinecartEntity.pushX = value; }

// public yarnwrap.recipe.Ingredient ACCEPTABLE_FUEL() { return new yarnwrap.recipe.Ingredient(wrapperContained.ACCEPTABLE_FUEL); }
// public void ACCEPTABLE_FUEL(yarnwrap.recipe.Ingredient value) { wrapperContained.ACCEPTABLE_FUEL = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient ACCEPTABLE_FUEL() { return new yarnwrap.recipe.Ingredient(net.minecraft.entity.vehicle.FurnaceMinecartEntity.ACCEPTABLE_FUEL); }
// public static void ACCEPTABLE_FUEL(yarnwrap.recipe.Ingredient value, ) { net.minecraft.entity.vehicle.FurnaceMinecartEntity.ACCEPTABLE_FUEL = value.wrapperContained; }

// public int fuel() { return wrapperContained.fuel; }
// public void fuel(int value) { wrapperContained.fuel = value; }
// public static int fuel() { return net.minecraft.entity.vehicle.FurnaceMinecartEntity.fuel; }
// public static void fuel(int value, ) { net.minecraft.entity.vehicle.FurnaceMinecartEntity.fuel = value; }

// public yarnwrap.entity.data.TrackedData LIT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LIT); }
// public void LIT(yarnwrap.entity.data.TrackedData value) { wrapperContained.LIT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData LIT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.vehicle.FurnaceMinecartEntity.LIT); }
// public static void LIT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.vehicle.FurnaceMinecartEntity.LIT = value.wrapperContained; }

public FurnaceMinecartEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.FurnaceMinecartEntity(world.wrapperContained,x,y,z); }
// public void setLit(boolean lit) { wrapperContained.setLit(lit); }
// public static void setLit(boolean lit, ) { net.minecraft.entity.vehicle.FurnaceMinecartEntity.setLit(lit); }
// public boolean isLit() { return wrapperContained.isLit(); }
// public static boolean isLit() { return net.minecraft.entity.vehicle.FurnaceMinecartEntity.isLit(); }

}