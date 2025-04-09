package yarnwrap.entity;
public class ItemSteerable { public net.minecraft.entity.ItemSteerable wrapperContained; public ItemSteerable(net.minecraft.entity.ItemSteerable wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean consumeOnAStickItem() { return wrapperContained.consumeOnAStickItem(); }

}