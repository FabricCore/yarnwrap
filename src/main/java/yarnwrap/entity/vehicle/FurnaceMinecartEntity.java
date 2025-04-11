package yarnwrap.entity.vehicle;
public class FurnaceMinecartEntity { public net.minecraft.entity.vehicle.FurnaceMinecartEntity wrapperContained; public FurnaceMinecartEntity(net.minecraft.entity.vehicle.FurnaceMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public double pushZ() { return wrapperContained.pushZ; }
public void pushZ(double value) { wrapperContained.pushZ = value; }
public double pushX() { return wrapperContained.pushX; }
public void pushX(double value) { wrapperContained.pushX = value; }
// public yarnwrap.recipe.Ingredient ACCEPTABLE_FUEL() { return new yarnwrap.recipe.Ingredient(wrapperContained.ACCEPTABLE_FUEL); }
// public void ACCEPTABLE_FUEL(yarnwrap.recipe.Ingredient value) { wrapperContained.ACCEPTABLE_FUEL = value.wrapperContained; }
// public int fuel() { return wrapperContained.fuel; }
// public void fuel(int value) { wrapperContained.fuel = value; }
// public yarnwrap.entity.data.TrackedData LIT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LIT); }
// public void LIT(yarnwrap.entity.data.TrackedData value) { wrapperContained.LIT = value.wrapperContained; }
// public void setLit(boolean lit) { wrapperContained.setLit(lit); }
// public boolean isLit() { return wrapperContained.isLit(); }

}