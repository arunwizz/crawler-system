package com.arunwizz.crawlersystem.networkfetcher;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class HTTP200Handler implements IHTTPResponseHandler {

	ByteBuffer buf = ByteBuffer.allocateDirect(128);
	
	@Override
	public void handle(SocketChannel sChannel) {

		System.err.println("HTTP200 Handled");
	}

}
