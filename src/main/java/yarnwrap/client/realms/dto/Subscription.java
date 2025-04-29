package yarnwrap.client.realms.dto;
public class Subscription { public net.minecraft.client.realms.dto.Subscription wrapperContained; public Subscription(net.minecraft.client.realms.dto.Subscription wrapperContained) { this.wrapperContained = wrapperContained; }

public long startDate() { return wrapperContained.startDate; }
public void startDate(long value) { wrapperContained.startDate = value; }
// public static long startDate() { return net.minecraft.client.realms.dto.Subscription.startDate; }
// public static void startDate(long value, ) { net.minecraft.client.realms.dto.Subscription.startDate = value; }

public int daysLeft() { return wrapperContained.daysLeft; }
public void daysLeft(int value) { wrapperContained.daysLeft = value; }
// public static int daysLeft() { return net.minecraft.client.realms.dto.Subscription.daysLeft; }
// public static void daysLeft(int value, ) { net.minecraft.client.realms.dto.Subscription.daysLeft = value; }

public Object type() { return wrapperContained.type; }
// public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.realms.dto.Subscription.type; }
// // public static void type(Object value, ) { net.minecraft.client.realms.dto.Subscription.type = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.Subscription.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.Subscription.LOGGER = value; }

// public yarnwrap.client.realms.dto.Subscription parse(java.lang.String json) { return new yarnwrap.client.realms.dto.Subscription(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.Subscription parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.Subscription(net.minecraft.client.realms.dto.Subscription.parse(json)); }
// public Object typeFrom(java.lang.String subscriptionType) { return wrapperContained.typeFrom(subscriptionType); }
// public static Object typeFrom(java.lang.String subscriptionType, ) { return net.minecraft.client.realms.dto.Subscription.typeFrom(subscriptionType); }

}