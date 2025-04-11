package yarnwrap.client.realms.dto;
public class Subscription { public net.minecraft.client.realms.dto.Subscription wrapperContained; public Subscription(net.minecraft.client.realms.dto.Subscription wrapperContained) { this.wrapperContained = wrapperContained; }

public long startDate() { return wrapperContained.startDate; }
public void startDate(long value) { wrapperContained.startDate = value; }
public int daysLeft() { return wrapperContained.daysLeft; }
public void daysLeft(int value) { wrapperContained.daysLeft = value; }
public Object type() { return wrapperContained.type; }
// public void type(Object value) { wrapperContained.type = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.realms.dto.Subscription parse(java.lang.String json) { return new yarnwrap.client.realms.dto.Subscription(wrapperContained.parse(json)); }
// public Object typeFrom(java.lang.String subscriptionType) { return wrapperContained.typeFrom(subscriptionType); }

}