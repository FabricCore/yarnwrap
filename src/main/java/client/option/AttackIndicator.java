package yarnwrap.client.option;
public class AttackIndicator { public net.minecraft.client.option.AttackIndicator wrapperContained; public AttackIndicator(net.minecraft.client.option.AttackIndicator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
public yarnwrap.client.option.AttackIndicator byId(int id) { return new yarnwrap.client.option.AttackIndicator(wrapperContained.byId(id)); }

}