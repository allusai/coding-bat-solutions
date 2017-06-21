{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf820
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 This is the solution I wrote for the CodingBat Array 3 (Hard array questions) programming challenge \'93maxSpan.\'94 Where you have to find the longest span in an array of integers, defined as the number of elements between the leftmost and rightmost appearances of an element inclusive. For example, in the array [1,2,1,1,3], the distance between the leftmost 1 and the right most 1 inclusive is 4 and the longest span in the array. The algorithm itself has a few additions by me not required to solve the problem, but to make the program more efficient for larger arrays since the nested loop gives a O(n^2) time complexity. The main method has a few sample tests given by CodingBat and the image file in this repository shows the complete list of tests for various cases also provided by CodingBat. The comments were for personal learning as I was debugging the code and analyzing what was wrong with my initial solution.}