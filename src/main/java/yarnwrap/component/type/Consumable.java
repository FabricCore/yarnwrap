package yarnwrap.component.type;
public class Consumable { public net.minecraft.component.type.Consumable wrapperContained; public Consumable(net.minecraft.component.type.Consumable wrapperContained) { this.wrapperContained = wrapperContained; }

public void onConsume(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,yarnwrap.component.type.ConsumableComponent consumable) { wrapperContained.onConsume(world.wrapperContained,user.wrapperContained,stack.wrapperContained,consumable.wrapperContained); }
// public static void onConsume(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,yarnwrap.component.type.ConsumableComponent consumable, ) { net.minecraft.component.type.Consumable.onConsume(world.wrapperContained,user.wrapperContained,stack.wrapperContained,consumable.wrapperContained); }

}