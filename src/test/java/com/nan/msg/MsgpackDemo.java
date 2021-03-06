package com.nan.msg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.msgpack.MessagePack;
import org.msgpack.template.Templates;

public class MsgpackDemo {

	public static void main(String[] args) throws IOException {
		List<String> src = new ArrayList<String>();
		src.add("msgpack");
		src.add("kumofs");
		src.add("viver");
		MessagePack msgpack = new MessagePack();
		byte[] raw = msgpack.write(src);
		List<String> dst1 = msgpack.read(raw,Templates.tList(Templates.TString));
		System.out.println(dst1.get(0));
		System.out.println(dst1.get(1));
		System.out.println(dst1.get(2));
	}

}
