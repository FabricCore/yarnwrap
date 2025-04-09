package yarnwrap.entity.vehicle;
public class FurnaceMinecartEntity { public net.minecraft.entity.vehicle.FurnaceMinecartEntity wrapperContained; public FurnaceMinecartEntity(net.minecraft.entity.vehicle.FurnaceMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public double pushZ() { return wrapperContained.pushZ; }
public double pushX() { return wrapperContained.pushX; }
// public yarnwrap.recipe.Ingredient ACCEPTABLE_FUEL() { return new yarnwrap.recipe.Ingredient(wrapperContained.ACCEPTABLE_FUEL); }
// public int fuel() { return wrapperContained.fuel; }
// public yarnwrap.entity.data.TrackedData LIT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LIT); }
// public void setLit(boolean lit) { wrapperContained.setLit(lit); }
// public boolean isLit() { return wrapperContained.isLit(); }

}