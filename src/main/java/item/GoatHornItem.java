package yarnwrap.item;
public class GoatHornItem { public net.minecraft.item.GoatHornItem wrapperContained; public GoatHornItem(net.minecraft.item.GoatHornItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey instrumentTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.instrumentTag); }
public yarnwrap.item.ItemStack getStackForInstrument(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry instrument) { return new yarnwrap.item.ItemStack(wrapperContained.getStackForInstrument(item.wrapperContained,instrument.wrapperContained)); }
public void setRandomInstrumentFromTag(yarnwrap.item.ItemStack stack,yarnwrap.registry.tag.TagKey instrumentTag,yarnwrap.util.math.random.Random random) { wrapperContained.setRandomInstrumentFromTag(stack.wrapperContained,instrumentTag.wrapperContained,random.wrapperContained); }
// public void playSound(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.Instrument instrument) { wrapperContained.playSound(world.wrapperContained,player.wrapperContained,instrument.wrapperContained); }
// public java.util.Optional getInstrument(yarnwrap.item.ItemStack stack) { return wrapperContained.getInstrument(stack.wrapperContained); }

}