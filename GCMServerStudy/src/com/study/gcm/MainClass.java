package com.study.gcm;

import java.io.IOException;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;

public class MainClass {

	static private final String collapseKey = "collapseKey";
	static private final boolean delayWhileIdle = true;
	static private final boolean dryRun = true;
	static private final String restrictedPackageName = "package.name";
	static private final int retries = 42;
	static private final int ttl = 108;

	public static void main(String[] args) throws IOException {

		Sender sender = new Sender("AIzaSyBTOBHYtyiKeftJyIAdDuiHNAZjjZIZANk");
		Message message = new Message.Builder().collapseKey(collapseKey)
				.delayWhileIdle(delayWhileIdle).dryRun(dryRun)
				.restrictedPackageName(restrictedPackageName).timeToLive(ttl)
				.addData("k0", null).addData(null, "v0").addData("k1", "v1")
				.addData("k2", "v2").addData("k3", "v3").build();

		sender.send(
				message,
				"APA91bGt1OtuEqlYnHcyR1cCylhCkaFP9QFK4NpXeKeOiT_mGHtdisTkA3jpq5PyORvOGOIARLYPDjURaDyC5gjS8cfQGPWita6AyJEuMzyY4EI80jOLkbdstkUrw0iRWtIDy11419Ep",
				2);

		System.out.println("Work Done");
	}

}
