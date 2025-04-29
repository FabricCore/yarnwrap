package yarnwrap.item;
public class GoatHornItem { public net.minecraft.item.GoatHornItem wrapperContained; public GoatHornItem(net.minecraft.item.GoatHornItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey instrumentTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.instrumentTag); }
// public void instrumentTag(yarnwrap.registry.tag.TagKey value) { wrapperContained.instrumentTag = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey instrumentTag() { return new yarnwrap.registry.tag.TagKey(net.minecraft.item.GoatHornItem.instrumentTag); }
// public static void instrumentTag(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.item.GoatHornItem.instrumentTag = value.wrapperContained; }

// public GoatHornItem(Object settings,yarnwrap.registry.tag.TagKey instrumentTag) { this.wrapperContained = new net.minecraft.item.GoatHornItem(settings,instrumentTag.wrapperContained); }
// public yarnwrap.item.ItemStack getStackForInstrument(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry instrument) { return new yarnwrap.item.ItemStack(wrapperContained.getStackForInstrument(item.wrapperContained,instrument.wrapperContained)); }
// public static yarnwrap.item.ItemStack getStackForInstrument(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry instrument, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.GoatHornItem.getStackForInstrument(item.wrapperContained,instrument.wrapperContained)); }
// public void setRandomInstrumentFromTag(yarnwrap.item.ItemStack stack,yarnwrap.registry.tag.TagKey instrumentTag,yarnwrap.util.math.random.Random random) { wrapperContained.setRandomInstrumentFromTag(stack.wrapperContained,instrumentTag.wrapperContained,random.wrapperContained); }
// public static void setRandomInstrumentFromTag(yarnwrap.item.ItemStack stack,yarnwrap.registry.tag.TagKey instrumentTag,yarnwrap.util.math.random.Random random, ) { net.minecraft.item.GoatHornItem.setRandomInstrumentFromTag(stack.wrapperContained,instrumentTag.wrapperContained,random.wrapperContained); }
// public void playSound(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.Instrument instrument) { wrapperContained.playSound(world.wrapperContained,player.wrapperContained,instrument.wrapperContained); }
// public static void playSound(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.Instrument instrument, ) { net.minecraft.item.GoatHornItem.playSound(world.wrapperContained,player.wrapperContained,instrument.wrapperContained); }
// public java.util.Optional getInstrument(yarnwrap.item.ItemStack stack) { return wrapperContained.getInstrument(stack.wrapperContained); }
// public static java.util.Optional getInstrument(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.GoatHornItem.getInstrument(stack.wrapperContained); }
// public java.lang.Integer method_45432(yarnwrap.registry.entry.RegistryEntry instrument) { return wrapperContained.method_45432(instrument.wrapperContained); }
// public static java.lang.Integer method_45432(yarnwrap.registry.entry.RegistryEntry instrument, ) { return net.minecraft.item.GoatHornItem.method_45432(instrument.wrapperContained); }
// public void method_45433(yarnwrap.item.ItemStack instrument) { wrapperContained.method_45433(instrument.wrapperContained); }
// public static void method_45433(yarnwrap.item.ItemStack instrument, ) { net.minecraft.item.GoatHornItem.method_45433(instrument.wrapperContained); }

}