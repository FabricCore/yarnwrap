package yarnwrap.client.realms.dto;
public class Subscription { public net.minecraft.client.realms.dto.Subscription wrapperContained; public Subscription(net.minecraft.client.realms.dto.Subscription wrapperContained) { this.wrapperContained = wrapperContained; }

public long startDate() { return wrapperContained.startDate; }
public int daysLeft() { return wrapperContained.daysLeft; }
public Object type() { return wrapperContained.type; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.Subscription parse(java.lang.String json) { return new yarnwrap.client.realms.dto.Subscription(wrapperContained.parse(json)); }
// public Object typeFrom(java.lang.String subscriptionType) { return wrapperContained.typeFrom(subscriptionType); }

}