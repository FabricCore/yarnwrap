package yarnwrap.client.network;
public class RedirectResolver { public net.minecraft.client.network.RedirectResolver wrapperContained; public RedirectResolver(net.minecraft.client.network.RedirectResolver wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.network.RedirectResolver INVALID() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.INVALID); }
// public void INVALID(yarnwrap.client.network.RedirectResolver value) { wrapperContained.INVALID = value.wrapperContained; }
// public yarnwrap.client.network.RedirectResolver createSrv() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.createSrv()); }

}