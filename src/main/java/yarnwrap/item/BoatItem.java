package yarnwrap.item;
public class BoatItem { public net.minecraft.item.BoatItem wrapperContained; public BoatItem(net.minecraft.item.BoatItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityType boatEntityType() { return new yarnwrap.entity.EntityType(wrapperContained.boatEntityType); }
// public void boatEntityType(yarnwrap.entity.EntityType value) { wrapperContained.boatEntityType = value.wrapperContained; }
// public static yarnwrap.entity.EntityType boatEntityType() { return new yarnwrap.entity.EntityType(net.minecraft.item.BoatItem.boatEntityType); }
// public static void boatEntityType(yarnwrap.entity.EntityType value, ) { net.minecraft.item.BoatItem.boatEntityType = value.wrapperContained; }

// public BoatItem(yarnwrap.entity.EntityType boatEntityType,Object settings) { this.wrapperContained = new net.minecraft.item.BoatItem(boatEntityType.wrapperContained,settings); }
// public yarnwrap.entity.vehicle.AbstractBoatEntity createEntity(yarnwrap.world.World world,yarnwrap.util.hit.HitResult hitResult,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.entity.vehicle.AbstractBoatEntity(wrapperContained.createEntity(world.wrapperContained,hitResult.wrapperContained,stack.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.entity.vehicle.AbstractBoatEntity createEntity(yarnwrap.world.World world,yarnwrap.util.hit.HitResult hitResult,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.entity.vehicle.AbstractBoatEntity(net.minecraft.item.BoatItem.createEntity(world.wrapperContained,hitResult.wrapperContained,stack.wrapperContained,player.wrapperContained)); }

}