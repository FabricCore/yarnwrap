package yarnwrap.network.packet.c2s.login;
public class UnknownLoginQueryResponsePayload { public net.minecraft.network.packet.c2s.login.UnknownLoginQueryResponsePayload wrapperContained; public UnknownLoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.UnknownLoginQueryResponsePayload wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload INSTANCE() { return new yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload INSTANCE() { return new yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.UnknownLoginQueryResponsePayload.INSTANCE); }
// public static void INSTANCE(yarnwrap.network.packet.c2s.login.UnknownLoginQueryResponsePayload value, ) { net.minecraft.network.packet.c2s.login.UnknownLoginQueryResponsePayload.INSTANCE = value.wrapperContained; }


}