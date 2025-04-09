package yarnwrap.client.option;
public class NarratorMode { public net.minecraft.client.option.NarratorMode wrapperContained; public NarratorMode(net.minecraft.client.option.NarratorMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.client.option.NarratorMode byId(int id) { return new yarnwrap.client.option.NarratorMode(wrapperContained.byId(id)); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public boolean shouldNarrateChat() { return wrapperContained.shouldNarrateChat(); }
public boolean shouldNarrateSystem() { return wrapperContained.shouldNarrateSystem(); }

}