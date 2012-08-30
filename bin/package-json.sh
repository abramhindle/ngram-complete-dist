#!/bin/bash
rm -rf /tmp/$1
rm -rf /tmp/$1-pretty
mkdir /tmp/$1 
mkdir /tmp/$1-pretty
cp $1*json /tmp/$1/
cd /tmp/$1/
for file in *.json
do
	echo $file
	json_xs -f json -t json-pretty < $file > /tmp/$1-pretty/$file
done
cd /tmp
rm $1.json.tar.gz
tar cvfz $1.json.tar.gz $1 $1-pretty
