package yarnwrap.server.dedicated;
public class EulaReader { public net.minecraft.server.dedicated.EulaReader wrapperContained; public EulaReader(net.minecraft.server.dedicated.EulaReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean eulaAgreedTo() { return wrapperContained.eulaAgreedTo; }
// public void eulaAgreedTo(boolean value) { wrapperContained.eulaAgreedTo = value; }
// public static boolean eulaAgreedTo() { return net.minecraft.server.dedicated.EulaReader.eulaAgreedTo; }
// public static void eulaAgreedTo(boolean value, ) { net.minecraft.server.dedicated.EulaReader.eulaAgreedTo = value; }

// public java.nio.file.Path eulaFile() { return wrapperContained.eulaFile; }
// public void eulaFile(java.nio.file.Path value) { wrapperContained.eulaFile = value; }
// public static java.nio.file.Path eulaFile() { return net.minecraft.server.dedicated.EulaReader.eulaFile; }
// public static void eulaFile(java.nio.file.Path value, ) { net.minecraft.server.dedicated.EulaReader.eulaFile = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.dedicated.EulaReader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.dedicated.EulaReader.LOGGER = value; }

public EulaReader(java.nio.file.Path eulaFile) { this.wrapperContained = new net.minecraft.server.dedicated.EulaReader(eulaFile); }
public boolean isEulaAgreedTo() { return wrapperContained.isEulaAgreedTo(); }
// public static boolean isEulaAgreedTo() { return net.minecraft.server.dedicated.EulaReader.isEulaAgreedTo(); }
// public boolean checkEulaAgreement() { return wrapperContained.checkEulaAgreement(); }
// public static boolean checkEulaAgreement() { return net.minecraft.server.dedicated.EulaReader.checkEulaAgreement(); }
// public void createEulaFile() { wrapperContained.createEulaFile(); }
// public static void createEulaFile() { net.minecraft.server.dedicated.EulaReader.createEulaFile(); }

}