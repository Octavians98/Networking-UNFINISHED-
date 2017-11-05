#!/bin/bash
cat '/home/oss1g16/Desktop/host.txt' | while read x
do
	ping6 -c 20 "$x"
done | grep -i 'rtt\|PING' | awk '{print $0, "\n"}' > '/home/oss1g16/Desktop/result6.txt'

