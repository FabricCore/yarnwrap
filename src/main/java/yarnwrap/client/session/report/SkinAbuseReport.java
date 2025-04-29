package yarnwrap.client.session.report;
public class SkinAbuseReport { public net.minecraft.client.session.report.SkinAbuseReport wrapperContained; public SkinAbuseReport(net.minecraft.client.session.report.SkinAbuseReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier skinSupplier() { return wrapperContained.skinSupplier; }
// public void skinSupplier(java.util.function.Supplier value) { wrapperContained.skinSupplier = value; }
// public static java.util.function.Supplier skinSupplier() { return net.minecraft.client.session.report.SkinAbuseReport.skinSupplier; }
// public static void skinSupplier(java.util.function.Supplier value, ) { net.minecraft.client.session.report.SkinAbuseReport.skinSupplier = value; }

// public SkinAbuseReport(java.util.UUID reportId,java.time.Instant currentTime,java.util.UUID reportedPlayerUuid,java.util.function.Supplier skinSupplier) { this.wrapperContained = new net.minecraft.client.session.report.SkinAbuseReport(reportId,currentTime,reportedPlayerUuid,skinSupplier); }
public java.util.function.Supplier getSkinSupplier() { return wrapperContained.getSkinSupplier(); }
// public static java.util.function.Supplier getSkinSupplier() { return net.minecraft.client.session.report.SkinAbuseReport.getSkinSupplier(); }

}