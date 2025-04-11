package yarnwrap.item;
public class BoatItem { public net.minecraft.item.BoatItem wrapperContained; public BoatItem(net.minecraft.item.BoatItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate RIDERS() { return wrapperContained.RIDERS; }
// public void RIDERS(java.util.function.Predicate value) { wrapperContained.RIDERS = value; }
// public boolean chest() { return wrapperContained.chest; }
// public void chest(boolean value) { wrapperContained.chest = value; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public BoatItem(boolean chest,Object type,Object settings) { this.wrapperContained = new net.minecraft.item.BoatItem(chest,type,settings); }
// public yarnwrap.entity.vehicle.BoatEntity createEntity(yarnwrap.world.World world,yarnwrap.util.hit.HitResult hitResult,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.entity.vehicle.BoatEntity(wrapperContained.createEntity(world.wrapperContained,hitResult.wrapperContained,stack.wrapperContained,player.wrapperContained)); }

}