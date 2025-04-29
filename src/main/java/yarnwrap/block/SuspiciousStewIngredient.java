package yarnwrap.block;
public class SuspiciousStewIngredient { public net.minecraft.block.SuspiciousStewIngredient wrapperContained; public SuspiciousStewIngredient(net.minecraft.block.SuspiciousStewIngredient wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List getAll() { return wrapperContained.getAll(); }
public static java.util.List getAll() { return net.minecraft.block.SuspiciousStewIngredient.getAll(); }
// public yarnwrap.block.SuspiciousStewIngredient of(yarnwrap.item.ItemConvertible item) { return new yarnwrap.block.SuspiciousStewIngredient(wrapperContained.of(item.wrapperContained)); }
// public static yarnwrap.block.SuspiciousStewIngredient of(yarnwrap.item.ItemConvertible item, ) { return new yarnwrap.block.SuspiciousStewIngredient(net.minecraft.block.SuspiciousStewIngredient.of(item.wrapperContained)); }
public yarnwrap.component.type.SuspiciousStewEffectsComponent getStewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.getStewEffects()); }
// public static yarnwrap.component.type.SuspiciousStewEffectsComponent getStewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(net.minecraft.block.SuspiciousStewIngredient.getStewEffects()); }

}