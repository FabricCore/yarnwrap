package yarnwrap.item;
public class GoatHornItem { public net.minecraft.item.GoatHornItem wrapperContained; public GoatHornItem(net.minecraft.item.GoatHornItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack getStackForInstrument(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry instrument) { return new yarnwrap.item.ItemStack(wrapperContained.getStackForInstrument(item.wrapperContained,instrument.wrapperContained)); }
// public static yarnwrap.item.ItemStack getStackForInstrument(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry instrument, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.GoatHornItem.getStackForInstrument(item.wrapperContained,instrument.wrapperContained)); }
// public void playSound(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.Instrument instrument) { wrapperContained.playSound(world.wrapperContained,player.wrapperContained,instrument.wrapperContained); }
// public static void playSound(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.Instrument instrument, ) { net.minecraft.item.GoatHornItem.playSound(world.wrapperContained,player.wrapperContained,instrument.wrapperContained); }
// public java.util.Optional getInstrument(yarnwrap.item.ItemStack stack,Object registries) { return wrapperContained.getInstrument(stack.wrapperContained,registries); }
// public static java.util.Optional getInstrument(yarnwrap.item.ItemStack stack,Object registries, ) { return net.minecraft.item.GoatHornItem.getInstrument(stack.wrapperContained,registries); }
// public java.lang.Integer method_45432(yarnwrap.registry.entry.RegistryEntry instrument) { return wrapperContained.method_45432(instrument.wrapperContained); }
// public static java.lang.Integer method_45432(yarnwrap.registry.entry.RegistryEntry instrument, ) { return net.minecraft.item.GoatHornItem.method_45432(instrument.wrapperContained); }

}