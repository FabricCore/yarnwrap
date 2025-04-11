package yarnwrap.client.resource;
public class PeriodicNotificationManager { public net.minecraft.client.resource.PeriodicNotificationManager wrapperContained; public PeriodicNotificationManager(net.minecraft.client.resource.PeriodicNotificationManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2BooleanFunction countryPredicate() { return wrapperContained.countryPredicate; }
// public void countryPredicate(it.unimi.dsi.fastutil.objects.Object2BooleanFunction value) { wrapperContained.countryPredicate = value; }
// public java.util.Timer timer() { return wrapperContained.timer; }
// public void timer(java.util.Timer value) { wrapperContained.timer = value; }
// public Object task() { return wrapperContained.task; }
// // public void task(Object value) { wrapperContained.task = value; }
public PeriodicNotificationManager(yarnwrap.util.Identifier id,it.unimi.dsi.fastutil.objects.Object2BooleanFunction countryPredicate) { this.wrapperContained = new net.minecraft.client.resource.PeriodicNotificationManager(id.wrapperContained,countryPredicate); }
// public void cancelTimer() { wrapperContained.cancelTimer(); }
// public long method_40191(long entry) { return wrapperContained.method_40191(entry); }
// public com.mojang.datafixers.kinds.App method_40193(Object instance) { return wrapperContained.method_40193(instance); }
// public long method_40194(Object entry) { return wrapperContained.method_40194(entry); }
// public long getMinDelay(java.util.List entries) { return wrapperContained.getMinDelay(entries); }
// public long getPeriod(java.util.List entries,long minDelay) { return wrapperContained.getPeriod(entries,minDelay); }
// public boolean method_40197(Object entry) { return wrapperContained.method_40197(entry); }
// public boolean method_40200(Object entry) { return wrapperContained.method_40200(entry); }

}