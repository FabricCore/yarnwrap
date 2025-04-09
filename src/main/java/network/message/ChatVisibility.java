package yarnwrap.network.message;
public class ChatVisibility { public net.minecraft.network.message.ChatVisibility wrapperContained; public ChatVisibility(net.minecraft.network.message.ChatVisibility wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
public yarnwrap.network.message.ChatVisibility byId(int id) { return new yarnwrap.network.message.ChatVisibility(wrapperContained.byId(id)); }

}