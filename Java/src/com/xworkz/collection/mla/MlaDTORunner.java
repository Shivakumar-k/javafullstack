package com.xworkz.collection.mla;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MlaDTORunner {

	public static void main(String[] args) {

		MlaDTO dto1 = new MlaDTO("Shashikala Annasaheb Jolle", 54, "Nippani", "BJP", false, "female");
		MlaDTO dto2 = new MlaDTO("Ganesh Hukkeri", 45, "Chikkodi-Sadalga", "INC", false, "male");
		MlaDTO dto3 = new MlaDTO("Mahesh Kumathalli", 61, "Athani", "BJP", false, "male");
		MlaDTO dto4 = new MlaDTO("Srimanth Patil", 68, "Kagwad", "BJP", false, "male");
		MlaDTO dto5 = new MlaDTO("P Rajeev", 45, "Kudachi", "BJP", false, "male");
		MlaDTO dto6 = new MlaDTO("Duryodhan Mahalingappa Aihole", 66, "Raibag", "BJP", false, "male");
		MlaDTO dto7 = new MlaDTO("Umesh Katti", 61, "Hukkeri", "BJP", false, "male");
		MlaDTO dto8 = new MlaDTO("Balachandra Jarkiholi", 56, "Arabavi", "BJP", false, "male");
		MlaDTO dto9 = new MlaDTO("Ramesh Jarkiholi", 62, "Gokak", "BJP", false, "male");
		MlaDTO dto10 = new MlaDTO("Satish Jarkiholi", 60, "Yemkanmardi", "INC", false, "male");

		MlaDTO dto11 = new MlaDTO("Anil S Benake", 51, "Belgavi uttar", "BJP", false, "male");
		MlaDTO dto12 = new MlaDTO("Abhay Patil", 54, "Belgavi Dakshin", "BJP", false, "male");
		MlaDTO dto13 = new MlaDTO("Lakshmi Hebbalkar", 47, "Belgavi Rural", "INC", false, "male");
		MlaDTO dto14 = new MlaDTO("Anjali Nimbalkar", 49, "Khanapur", "INC", false, "male");
		MlaDTO dto15 = new MlaDTO("D. M. Basavantaray", 65, "Kittur", "BJP", false, "male");
		MlaDTO dto16 = new MlaDTO("Mahantesh Kaujlagi", 65, "Bailhongal", "INC", false, "male");
		MlaDTO dto17 = new MlaDTO("Saundatti Yellamma", 0, "Belagavi", "BJP", false, "female");
		MlaDTO dto18 = new MlaDTO("Mahadevappa Shivalingappa Yadawad", 55, "Ramdurg", "BJP", false, "male");
		MlaDTO dto19 = new MlaDTO("Govind M. Karjol", 72, "Mudhol", "BJP", false, "male");
		MlaDTO dto20 = new MlaDTO("Siddu Savadi", 60, "Terdal", "BJP", false, "male");

		MlaDTO dto21 = new MlaDTO("Anand Nyamagouda", 63, "Jamkandhi", "INC", false, "male");
		MlaDTO dto22 = new MlaDTO("Murugesh Nirani", 57, "Bilgi", "BJP", false, "male");
		MlaDTO dto23 = new MlaDTO("Siddaramaiah", 72, "Badami", "INC", false, "male");
		MlaDTO dto24 = new MlaDTO("Veerabhadrayya Charantimath", 65, "Bagalakot", "BJP", false, "male");
		MlaDTO dto25 = new MlaDTO("Doddanagowda Patil", 54, "Hungund", "BJP", false, "male");
		MlaDTO dto26 = new MlaDTO("A. S. Patil (Nadahalli)", 56, "Mudebihal", "BJP", false, "male");
		MlaDTO dto27 = new MlaDTO("Somanagouda Patil", 59, "Devar Hipparagi", "BJP", false, "male");
		MlaDTO dto28 = new MlaDTO("Shivanand S Patil", 65, "Basavana Bagevadi", "INC", false, "male");
		MlaDTO dto29 = new MlaDTO("M B Patil", 58, "Babaleshwar", "INC", false, "male");
		MlaDTO dto30 = new MlaDTO("Basangouda Patil Yatnal", 59, "Bijapur City", "BJP", false, "male");

		MlaDTO dto31 = new MlaDTO("Devanand Fulasing Chavan", 60, "Nagathan", "JDS", false, "male");
		MlaDTO dto32 = new MlaDTO("Y V Patil", 59, "Indli", "INC", false, "male");
		MlaDTO dto33 = new MlaDTO("Bhusanur Ramesh Balappa", 60, "Sindagi", "BJP", false, "male");
		MlaDTO dto34 = new MlaDTO("M. Y. Patil", 81, "Afzalpur ", "INC", false, "male");
		MlaDTO dto35 = new MlaDTO("Ajay Dharam Singh", 60, "Jevaragi", "INC", false, "male");
		MlaDTO dto36 = new MlaDTO("Narasimhanayak (Rajugouda)", 60, "Shorapur", "BJP", false, "male");
		MlaDTO dto37 = new MlaDTO("Sharanabasappa Gouda Darshanapur", 67, "Shahapur", "INC", false, "male");
		MlaDTO dto38 = new MlaDTO("Venkatreddy Mudnal", 69, "Yadgiri", "BJP", false, "male");
		MlaDTO dto39 = new MlaDTO("Nagangouda Kandkur", 65, "Gurmitkal", "JDS", false, "male");
		MlaDTO dto40 = new MlaDTO("Priyank Kharge", 44, "Chittapur", "INC", false, "male");

		MlaDTO dto41 = new MlaDTO("Rajkumar Patil", 45, "Sedam", "BJP", false, "male");
		MlaDTO dto42 = new MlaDTO("Avinash Jadhav", 61, "Chincholi", "BJP", false, "male");
		MlaDTO dto43 = new MlaDTO("Basawaraj Mattimud", 43, "Gulbarga Rural", "BJP", false, "male");
		MlaDTO dto44 = new MlaDTO("Dattatraya C. Patil Revoor", 40, "Gulbarga Dakshin", "BJP", false, "male");
		MlaDTO dto45 = new MlaDTO("Kaneez Fatima", 45, "Gulbarga Uttar", "INC", false, "male");
		MlaDTO dto46 = new MlaDTO("Guttedar Subhash Rukmayya", 49, "Aland", "BJP", false, "male");
		MlaDTO dto47 = new MlaDTO("Sharanu Salagar", 47, "Basavakaylana", "BJP", false, "male");
		MlaDTO dto48 = new MlaDTO("Rajshekar Basavaraj Patil", 55, "Homnabad", "INC", false, "male");
		MlaDTO dto49 = new MlaDTO("Bandeppa Kashempura", 58, "Bidar South", "JDS", false, "male");
		MlaDTO dto50 = new MlaDTO("Rahim Khan", 56, "Bidar", "INC", false, "male");

		MlaDTO dto51 = new MlaDTO("Eshwara Bhimanna Jhandre", 61, "Bhalki", "INC", false, "male");
		MlaDTO dto52 = new MlaDTO("Prabhu Chavhan", 53, "Aurad", "BJP", false, "male");
		MlaDTO dto53 = new MlaDTO("Basanagouda Daddal", 60, "Raichur Rural", "INC", false, "male");
		MlaDTO dto54 = new MlaDTO("DR. Sgivaraj Patil S", 60, "Raichuir", "BJP", false, "male");
		MlaDTO dto55 = new MlaDTO("Raja Venkatappa Naik", 65, "Manvi", "JDS", false, "male");
		MlaDTO dto56 = new MlaDTO("ShivanaGouda Naik", 60, "Devadurga", "BJP", false, "male");
		MlaDTO dto57 = new MlaDTO("D S Hoolageri", 59, "Lingsugur", "INC", false, "male");
		MlaDTO dto58 = new MlaDTO("Venkatrao", 59, "Sindhanur", "JDS", false, "male");
		MlaDTO dto59 = new MlaDTO("Basanagouda Turvihal", 65, "Maski", "INC", false, "male");
		MlaDTO dto60 = new MlaDTO("Amaregouda Linganagouda Patil", 64, "Kushtagi", "INC", false, "male");

		MlaDTO dto61 = new MlaDTO("Basavaraj Dhadesugur", 55, "Kanakagiri", "BJP", false, "male");
		MlaDTO dto62 = new MlaDTO("Paranna MUnavalli", 59, "Gangawati", "BJP", false, "male");
		MlaDTO dto63 = new MlaDTO("Achar Halappa Basappa", 60, "yelburga", "BJP", false, "male");
		MlaDTO dto64 = new MlaDTO("K. Raghavendra Basavaraj Hitnal", 67, "Koppal", "INC", false, "male");
		MlaDTO dto65 = new MlaDTO("Ramappa Lamani", 60, "Shirahatti", "BJP", false, "male");
		MlaDTO dto66 = new MlaDTO("H.K Patil", 69, "Gadag", "INC", false, "male");
		MlaDTO dto67 = new MlaDTO("Kalakappa Bnadi", 58, "Ron", "BJP", false, "male");
		MlaDTO dto68 = new MlaDTO("C C Patil", 64, "Nargiund", "BJP", false, "male");
		MlaDTO dto69 = new MlaDTO("Patil Munenakoppa Shankar", 55, "Navalgund", "BJP", false, "male");
		MlaDTO dto70 = new MlaDTO("Kusuma Shivalli", 51, "Kundgol", "INC", false, "male");

		MlaDTO dto71 = new MlaDTO("Amrupayyappa Desai", 59, "Dharwad", "BJP", false, "male");
		MlaDTO dto72 = new MlaDTO("Abbayya Prasad", 54, "Hubli Darwadh east", "INC", false, "male");
		MlaDTO dto73 = new MlaDTO("Jagadish Shettar", 67, "Hubli Dharwadh Central", "BJP", false, "male");
		MlaDTO dto74 = new MlaDTO("Aravind bellad", 53, "Hubli darwadh west", "BJP", false, "male");
		MlaDTO dto75 = new MlaDTO("C M Nimbannavar", 56, "Kalghatgi", "BJP", false, "male");
		MlaDTO dto76 = new MlaDTO("R V Deshpande", 76, "Haliyal", "INC", false, "male");
		MlaDTO dto77 = new MlaDTO("Roopali Naik", 45, "Karwar", "BJP", false, "male");
		MlaDTO dto78 = new MlaDTO("Dinakar Keshav Shetty", 55, "Kumta", "BJP", false, "male");
		MlaDTO dto79 = new MlaDTO("Sunil Biliya Naik", 59, "Bhatkal", "BJP", false, "male");
		MlaDTO dto80 = new MlaDTO("Vishweshwar Hegde Kageri", 61, "Sirsi", "BJP", false, "male");

		MlaDTO dto81 = new MlaDTO("Arbali Shivaram Hebbar", 66, "Yellapur", "BJP", false, "male");
		MlaDTO dto82 = new MlaDTO("Srinivas mane", 54, "Hangal", "INC", false, "male");
		MlaDTO dto83 = new MlaDTO("Basavaraj Bommai", 63, "Shiggaon", "BJP", false, "male");
		MlaDTO dto84 = new MlaDTO("Neharu Olekar", 55, "Haveri(SC)", "BJP", false, "male");
		MlaDTO dto85 = new MlaDTO("Ballary Virupakshappa Rudrappa", 59, "Byadagi", "BJP", false, "male");
		MlaDTO dto86 = new MlaDTO("B C Patil", 66, "Hirekerur", "BJP", false, "male");
		MlaDTO dto87 = new MlaDTO("Arunkumar Guthur", 55, "Ranebennur", "BJP", false, "male");
		MlaDTO dto88 = new MlaDTO("P T Parameshwar Naik", 57, "Hadagalli", "INC", false, "male");
		MlaDTO dto89 = new MlaDTO("L.B.P Bheemanaik", 66, "Hagaribommanahalli", "INC", false, "male");
		MlaDTO dto90 = new MlaDTO("Anandh singh", 56, "Vijanagara", "BJP", false, "male");

		MlaDTO dto91 = new MlaDTO("J.N Ganesh", 56, "Kampli", "INC", false, "male");
		MlaDTO dto92 = new MlaDTO("M.S Somalingappa", 60, "Siruguppa", "BJP", false, "male");
		MlaDTO dto93 = new MlaDTO("B.Nagendra", 51, "Bellary Rural", "INC", false, "male");
		MlaDTO dto94 = new MlaDTO("G.Somashekara Reddy", 57, "Bellary City", "BJP", false, "male");
		MlaDTO dto95 = new MlaDTO("E Tukaram", 55, "Sandur", "INC", false, "male");
		MlaDTO dto96 = new MlaDTO("N.Y.Gopalakrishna", 0, "Kudligi", "BJP", false, "male");
		MlaDTO dto97 = new MlaDTO("B. Sreeramulu", 51, "Molakalmuru", "BJP", false, "male");
		MlaDTO dto98 = new MlaDTO("T.Raghumurthy", 55, "Challakere", "INC", false, "male");
		MlaDTO dto99 = new MlaDTO("G.H Thippareddy", 69, "Chitradurga", "BJP", false, "male");
		MlaDTO dto100 = new MlaDTO("Poornima Krishnappa", 46, "Hiriyur", "BJP", false, "male");

		MlaDTO dto101 = new MlaDTO("Gulhatty D.Shekhar", 56, "Hosadurga", "BJP", false, "male");
		MlaDTO dto102 = new MlaDTO("M.Chandrappa", 57, "Holalkere", "BJP", false, "male");
		MlaDTO dto103 = new MlaDTO("S.V.Ramachandra", 60, "Jagalur", "BJP", false, "male");
		MlaDTO dto104 = new MlaDTO("G. Karunakara Reddy", 61, "Harapanahalli", "BJP", false, "male");
		MlaDTO dto105 = new MlaDTO("S. Ramappa", 67, "Harihar", "INC", false, "male");
		MlaDTO dto106 = new MlaDTO("S. A. Ravindranath", 76, "Davanagere North", "BJP", false, "male");
		MlaDTO dto107 = new MlaDTO("Shamanur Shivashankarappa", 92, "Davanagere South", "INC", false, "male");
		MlaDTO dto108 = new MlaDTO("N. Linganna	", 64, "Mayakonda", "BJP", false, "male");
		MlaDTO dto109 = new MlaDTO("K. Madal Veerupakshappa", 55, "Channagiri", "BJP", false, "male");
		MlaDTO dto110 = new MlaDTO("M. P. Renukacharya", 66, "Honnali	", "BJP", false, "male");

		MlaDTO dto111 = new MlaDTO("K. B. Ashok Naik", 59, "Shimoga Rural", "BJP", false, "male");
		MlaDTO dto112 = new MlaDTO("B.K. Sangameshwara", 56, "Bhadravati", "INC", false, "male");
		MlaDTO dto113 = new MlaDTO("K. S. Eshwarappa", 74, "Shimoga", "BJP", false, "male");
		MlaDTO dto114 = new MlaDTO("Araga Jnanendra", 70, "Tirthahalli", "BJP", false, "male");
		MlaDTO dto115 = new MlaDTO("B. S. Yeddyurappa", 80, "Shikaripura", "BJP", false, "male");
		MlaDTO dto116 = new MlaDTO("Kumar Bangarappa", 59, "Soraba", "BJP", false, "male");
		MlaDTO dto117 = new MlaDTO("Hartalu Halappa	", 62, "Sagar	", "BJP", false, "male");
		MlaDTO dto118 = new MlaDTO("B. M. Sukumar Shetty", 60, "Baindur", "BJP", false, "male");
		MlaDTO dto119 = new MlaDTO("Halady Srinivas Shetty", 60, "Kundapura", "BJP", false, "male");
		MlaDTO dto120 = new MlaDTO("K. Raghupati Bhat", 54, "Udupi", "BJP", false, "male");

		MlaDTO dto121 = new MlaDTO("Lalaji Mendon", 58, "Kapu", "BJP", false, "male");
		MlaDTO dto122 = new MlaDTO("V. Sunil Kumar ", 47, "Karkal", "BJP", false, "male");
		MlaDTO dto123 = new MlaDTO("T. D. Rajegowda", 60, "Sringeri", "INC", false, "male");
		MlaDTO dto124 = new MlaDTO("M. P. Kumaraswamy", 47, "Mudigere", "BJP", false, "male");
		MlaDTO dto125 = new MlaDTO("C. T. Ravi", 55, "Chikmagalur", "BJP", false, "male");
		MlaDTO dto126 = new MlaDTO("D. S. Suresh", 47, "Tarikere", "BJP", false, "male");
		MlaDTO dto127 = new MlaDTO("Belliprakash", 50, "Kadur", "BJP", false, "male");
		MlaDTO dto128 = new MlaDTO("J. C. Madhuswamy", 70, "Chiknayakanhalli", "BJP", false, "male");
		MlaDTO dto129 = new MlaDTO("B. C. Nagesh", 68, "Tiptur", "BJP", false, "male");
		MlaDTO dto130 = new MlaDTO("Jayaram A S	", 65, "Turuvekere", "BJP", false, "male");

		MlaDTO dto131 = new MlaDTO("Dr H.D. Ranganath", 62, "Kunigal", "INC", false, "male");
		MlaDTO dto132 = new MlaDTO("Tumkur City", 63, "G. B. Jyothi Ganesh", "BJP", false, "male");
		MlaDTO dto133 = new MlaDTO("Tumkur Rural", 47, "D. C. Gowrishankar", "JDS", false, "female");
		MlaDTO dto134 = new MlaDTO("Dr. G. Parameshwara	", 69, "Koratagere", "INC", false, "male");
		MlaDTO dto135 = new MlaDTO("S. R. Srinivas", 58, "Gubbi", "BJP", false, "male");
		MlaDTO dto136 = new MlaDTO("C. M. Rajesh Gowda", 68, "Sira", "BJP", false, "male");
		MlaDTO dto137 = new MlaDTO("Venkata Ramanappa", 57, "Pavagada", "INC", false, "male");
		MlaDTO dto138 = new MlaDTO("M.V. Veerabhadraiah", 60, "Madhugiri", "JDS", false, "male");
		MlaDTO dto139 = new MlaDTO("N. H. Shivashankara Reddy", 55, "Gauribidanur", "INC", false, "male");
		MlaDTO dto140 = new MlaDTO("S. N. Subbareddy", 58, "Bagepalli", "INC", false, "male");
		MlaDTO dto141 = new MlaDTO("K. Sudhakar", 70, "Chikkaballapur", "BJP", false, "male");

		MlaDTO dto142 = new MlaDTO("V. Muniyappa", 80, "Sidlaghatta", "INC", false, "male");
		MlaDTO dto143 = new MlaDTO("J. K. Krishnareddy", 64, "Chintamani", "BJP", false, "male");
		MlaDTO dto144 = new MlaDTO("K. R. Ramesh Kumar", 54, "Srinivasapur", "INC", false, "male");
		MlaDTO dto145 = new MlaDTO("H. Nagesh", 68, "Mulbagal", "INC", false, "male");
		MlaDTO dto146 = new MlaDTO("M. Roopakala", 55, "Kolar Gold Field", "INC", false, "female");
		MlaDTO dto147 = new MlaDTO("S. N. Narayanaswamy ", 56, "Bangarapet", "INC", false, "male");
		MlaDTO dto148 = new MlaDTO("K. Srinivasa Gowda	", 79, "Kolar", "INC", false, "male");
		MlaDTO dto149 = new MlaDTO("K. Y. Nanjegowda", 55, "Malur", "INC", false, "male");
		MlaDTO dto150 = new MlaDTO("S. R. Vishwanath", 60, "Yelahanka", "BJP", false, "male");

		MlaDTO dto151 = new MlaDTO("Byrathi Basavaraj", 65, "K. R. Pura", "BJP", false, "male");
		MlaDTO dto152 = new MlaDTO("Krishna Byre Gowda", 45, "Byatarayanapura", "INC", false, "male");
		MlaDTO dto153 = new MlaDTO("S. T. Somashekar", 35, "Yeshwanthpur", "BJP", false, "male");
		MlaDTO dto154 = new MlaDTO("Munirathna", 48, "Rajarajeshwari Nagar", "BJP", false, "male");
		MlaDTO dto155 = new MlaDTO("R. Manjunatha", 55, "Dasarahalli", "JDS", false, "male");
		MlaDTO dto156 = new MlaDTO("K. Gopalaiah", 60, "Mahalakshmi Layout", "BJP", false, "male");
		MlaDTO dto157 = new MlaDTO("Dr. C.N. Ashwath Narayan", 53, "Malleshwaram", "BJP", false, "male");
		MlaDTO dto158 = new MlaDTO("Byrathi Suresh", 58, "Hebbal", "INC", false, "male");
		MlaDTO dto159 = new MlaDTO("Akhanda Srinivas Murthy", 59, "Pulakeshinagar", "INC", false, "male");
		MlaDTO dto160 = new MlaDTO("K. J. George", 60, "Sarvagnanagar", "INC", false, "male");

		MlaDTO dto161 = new MlaDTO("S. Raghu", 56, "C. V. Raman Nagar", "BJP", false, "male");
		MlaDTO dto162 = new MlaDTO("Rizwan Arshad", 65, "Shivajinagar", "INC", false, "male");
		MlaDTO dto163 = new MlaDTO("N. A. Haris", 59, "Shanti Nagar", "INC", false, "male");
		MlaDTO dto164 = new MlaDTO("Dinesh Gundu Rao", 61, "Gandhi Nagar", "INC", false, "male");
		MlaDTO dto165 = new MlaDTO("S. Suresh Kumar", 57, "Rajaji Nagar", "BJP", false, "male");
		MlaDTO dto166 = new MlaDTO("V. Somanna", 64, "Govindraj Nagar", "BJP", false, "male");
		MlaDTO dto167 = new MlaDTO("M. Krishnappa", 60, "Vijay Nagar	", "INC", false, "male");
		MlaDTO dto168 = new MlaDTO("Zameer Ahmed Khan", 61, "Chamrajpet", "INC", false, "male");
		MlaDTO dto169 = new MlaDTO("Uday B. Garudachar", 59, "Chickpet", "BJP", false, "male");
		MlaDTO dto170 = new MlaDTO("L. A. Ravi Subramanya", 70, "Basavanagudi", "BJP", false, "male");

		MlaDTO dto171 = new MlaDTO("R. Ashoka	", 63, "Padmanaba Nagar", "BJP", false, "male");
		MlaDTO dto172 = new MlaDTO("Ramalinga Reddy", 64, "B.T.M. Layout", "INC", false, "male");
		MlaDTO dto173 = new MlaDTO("Soumya Reddy", 55, "Jayanagar", "INC", false, "female");
		MlaDTO dto174 = new MlaDTO("Aravind Limbavali", 48, "Mahadevapura", "BJP", false, "male");
		MlaDTO dto175 = new MlaDTO("M Satish Reddy", 46, "Bommanahalli", "BJP", false, "male");
		MlaDTO dto176 = new MlaDTO("M. Krishnappa", 50, "Bangalore South", "BJP", false, "male");
		MlaDTO dto177 = new MlaDTO("B.Shivanna", 45, "Anekal", "INC", false, "male");
		MlaDTO dto178 = new MlaDTO("Sharath Kumar Bachegowda", 58, "Hoskote", "INC", false, "male");
		MlaDTO dto179 = new MlaDTO("Nisarga Narayanaswamy L.N", 53, "Devanahalli", "JDS", false, "male");
		MlaDTO dto180 = new MlaDTO("T. Venkataramanaiah", 60, "Doddaballapur", "INC", false, "male");

		MlaDTO dto181 = new MlaDTO("Dr. K. Srinavasamurthy", 56, "Nelamangala", "JDS", false, "male");
		MlaDTO dto182 = new MlaDTO("A. Manjunath", 58, "Magadi", "JDS", false, "male");
		MlaDTO dto183 = new MlaDTO("Anitha Kumaraswamy", 57, "Ramanagara", "JDS", false, "female");
		MlaDTO dto184 = new MlaDTO("D. K. Shivakumar", 62, "Kanakapura", "INC", false, "male");
		MlaDTO dto185 = new MlaDTO("H. D. Kumaraswamy", 59, "Channapatna", "JDS", false, "male");
		MlaDTO dto186 = new MlaDTO("Dr. K. Annadani", 46, "Malavalli", "JDS", false, "male");
		MlaDTO dto187 = new MlaDTO("D. C. Thammanna", 78, "Maddur", "JDS", false, "male");
		MlaDTO dto188 = new MlaDTO("C. S. Puttaraju", 58, "Melukote", "JDS", false, "male");
		MlaDTO dto189 = new MlaDTO("M. Srinivas", 59, "Mandya", "JDS", false, "male");
		MlaDTO dto190 = new MlaDTO("Ravindra Srikantaiah", 61, "Shrirangapattana", "JDS", false, "male");

		MlaDTO dto191 = new MlaDTO("Suresh Gowda", 60, "Nagamangala", "JDS", false, "male");
		MlaDTO dto192 = new MlaDTO("Narayana Gowda", 63, "Krishnarajpet", "BJP", false, "male");
		MlaDTO dto193 = new MlaDTO("C. N. Balakrishna", 58, "Shravanabelagola", "JDS", false, "male");
		MlaDTO dto194 = new MlaDTO("K. M. Shivalingegowda", 64, "Arsikere", "INC", false, "male");
		MlaDTO dto195 = new MlaDTO("K. S. Lingesha", 43, "Belur", "JDS", false, "male");
		MlaDTO dto196 = new MlaDTO("Preetham J. Gowda", 67, "Hassan", "BJP", false, "male");
		MlaDTO dto197 = new MlaDTO("H. D. Revanna", 48, "Holenarasipur", "JDS", false, "male");
		MlaDTO dto198 = new MlaDTO("Ramaswamy", 52, "Arkalgud", "JDS", false, "male");
		MlaDTO dto199 = new MlaDTO("H. K. Kumaraswamy", 50, "Sakleshpur", "JDS", false, "male");

		MlaDTO dto200 = new MlaDTO("Harish Poonja", 45, "Belthangady", "BJP", false, "male");
		MlaDTO dto201 = new MlaDTO("Umanatha A. Kotian", 54, "Moodabidri", "BJP", false, "male");
		MlaDTO dto202 = new MlaDTO("Bharath Shetty", 35, "Mangalore City North", "BJP", false, "male");
		MlaDTO dto203 = new MlaDTO("D. Vedavyas Kamath", 53, "Mangalore City South", "BJP", false, "male");
		MlaDTO dto204 = new MlaDTO("U. T. Khader", 58, "Mangalore", "INC", false, "male");
		MlaDTO dto205 = new MlaDTO("Rajesh Naik", 55, "Bantval", "BJP", false, "male");
		MlaDTO dto206 = new MlaDTO("Sanjeeva Matandoor", 60, "Puttur", "BJP", false, "male");
		MlaDTO dto207 = new MlaDTO("Angara S", 61, "Sullia	", "BJP", false, "fmale");
		MlaDTO dto208 = new MlaDTO("Appachu Ranjan", 62, "Madikeri", "BJP", false, "male");
		MlaDTO dto209 = new MlaDTO("K. G. Bopaiah", 65, "Virajpet", "BJP", false, "male");

		MlaDTO dto210 = new MlaDTO("K. Mahadeva", 60, "Periyapatna", "JDS", false, "male");
		MlaDTO dto211 = new MlaDTO("S. R. Mahesh", 58, "Krishnarajanagara", "JDS", false, "male");
		MlaDTO dto212 = new MlaDTO("H. P. Manjunath", 47, "Hunsuru	", "INC", false, "male");
		MlaDTO dto213 = new MlaDTO("Anil Kumar C", 59, "Heggadadevankote", "INC", false, "male");
		MlaDTO dto214 = new MlaDTO("Harshavardhan B", 57, "Nanjangud", "BJP", false, "male");
		MlaDTO dto215 = new MlaDTO("GT Devegowda", 56, "Chamundeshwari", "JDS", false, "male");
		MlaDTO dto216 = new MlaDTO("S. A. Ramadas", 64, "Krishnaraja", "BJP", false, "male");
		MlaDTO dto217 = new MlaDTO("L. Nagendra", 46, "Chamaraja", "BJP", false, "male");
		MlaDTO dto218 = new MlaDTO("Tanveer Sait", 68, "Narasimharaja", "INC", false, "male");
		MlaDTO dto219 = new MlaDTO("Yathindra S", 70, "Varuna", "INC", false, "male");
		MlaDTO dto220 = new MlaDTO("Ashvin Kumar M", 47, "T Narasipura", "JDS", false, "male");

		MlaDTO dto221 = new MlaDTO("L.Nagendra", 61, "Hanur", "INC", false, "male");
		MlaDTO dto222 = new MlaDTO("N. Mahesh", 59, "Kollegal", "BJP", false, "male");
		MlaDTO dto223 = new MlaDTO("C. Puttarangashetty S", 50, "Chamrajanagar", "INC", false, "male");
		MlaDTO dto224 = new MlaDTO("C.S. Niranjan Kumar", 63, "Gundlupet", "BJP", false, "male");

		Collection<MlaDTO> mlaDetails = new ArrayList<MlaDTO>();
		mlaDetails.add(dto1);
		mlaDetails.add(dto2);
		mlaDetails.add(dto3);
		mlaDetails.add(dto4);
		mlaDetails.add(dto5);
		mlaDetails.add(dto6);
		mlaDetails.add(dto7);
		mlaDetails.add(dto8);
		mlaDetails.add(dto9);
		mlaDetails.add(dto10);

		mlaDetails.add(dto11);
		mlaDetails.add(dto12);
		mlaDetails.add(dto13);
		mlaDetails.add(dto14);
		mlaDetails.add(dto15);
		mlaDetails.add(dto16);
		mlaDetails.add(dto17);
		mlaDetails.add(dto18);
		mlaDetails.add(dto19);
		mlaDetails.add(dto20);

		mlaDetails.add(dto21);
		mlaDetails.add(dto22);
		mlaDetails.add(dto23);
		mlaDetails.add(dto24);
		mlaDetails.add(dto25);
		mlaDetails.add(dto26);
		mlaDetails.add(dto27);
		mlaDetails.add(dto28);
		mlaDetails.add(dto29);
		mlaDetails.add(dto30);

		mlaDetails.add(dto31);
		mlaDetails.add(dto32);
		mlaDetails.add(dto33);
		mlaDetails.add(dto34);
		mlaDetails.add(dto35);
		mlaDetails.add(dto36);
		mlaDetails.add(dto37);
		mlaDetails.add(dto38);
		mlaDetails.add(dto39);
		mlaDetails.add(dto40);

		mlaDetails.add(dto41);
		mlaDetails.add(dto42);
		mlaDetails.add(dto43);
		mlaDetails.add(dto44);
		mlaDetails.add(dto45);
		mlaDetails.add(dto46);
		mlaDetails.add(dto47);
		mlaDetails.add(dto48);
		mlaDetails.add(dto49);
		mlaDetails.add(dto50);

		mlaDetails.add(dto51);
		mlaDetails.add(dto52);
		mlaDetails.add(dto53);
		mlaDetails.add(dto54);
		mlaDetails.add(dto55);
		mlaDetails.add(dto56);
		mlaDetails.add(dto57);
		mlaDetails.add(dto58);
		mlaDetails.add(dto59);
		mlaDetails.add(dto60);

		mlaDetails.add(dto61);
		mlaDetails.add(dto62);
		mlaDetails.add(dto63);
		mlaDetails.add(dto64);
		mlaDetails.add(dto65);
		mlaDetails.add(dto66);
		mlaDetails.add(dto67);
		mlaDetails.add(dto68);
		mlaDetails.add(dto69);
		mlaDetails.add(dto70);

		mlaDetails.add(dto71);
		mlaDetails.add(dto72);
		mlaDetails.add(dto73);
		mlaDetails.add(dto74);
		mlaDetails.add(dto75);
		mlaDetails.add(dto76);
		mlaDetails.add(dto77);
		mlaDetails.add(dto78);
		mlaDetails.add(dto79);
		mlaDetails.add(dto80);

		mlaDetails.add(dto81);
		mlaDetails.add(dto82);
		mlaDetails.add(dto83);
		mlaDetails.add(dto84);
		mlaDetails.add(dto85);
		mlaDetails.add(dto86);
		mlaDetails.add(dto87);
		mlaDetails.add(dto88);
		mlaDetails.add(dto89);
		mlaDetails.add(dto90);

		mlaDetails.add(dto91);
		mlaDetails.add(dto92);
		mlaDetails.add(dto93);
		mlaDetails.add(dto94);
		mlaDetails.add(dto95);
		mlaDetails.add(dto96);
		mlaDetails.add(dto97);
		mlaDetails.add(dto98);
		mlaDetails.add(dto99);
		mlaDetails.add(dto100);

		mlaDetails.add(dto101);
		mlaDetails.add(dto102);
		mlaDetails.add(dto103);
		mlaDetails.add(dto104);
		mlaDetails.add(dto105);
		mlaDetails.add(dto106);
		mlaDetails.add(dto107);
		mlaDetails.add(dto108);
		mlaDetails.add(dto109);
		mlaDetails.add(dto110);

		mlaDetails.add(dto111);
		mlaDetails.add(dto112);
		mlaDetails.add(dto113);
		mlaDetails.add(dto114);
		mlaDetails.add(dto115);
		mlaDetails.add(dto116);
		mlaDetails.add(dto117);
		mlaDetails.add(dto118);
		mlaDetails.add(dto119);
		mlaDetails.add(dto120);

		mlaDetails.add(dto121);
		mlaDetails.add(dto122);
		mlaDetails.add(dto123);
		mlaDetails.add(dto124);
		mlaDetails.add(dto125);
		mlaDetails.add(dto126);
		mlaDetails.add(dto127);
		mlaDetails.add(dto128);
		mlaDetails.add(dto129);
		mlaDetails.add(dto130);

		mlaDetails.add(dto131);
		mlaDetails.add(dto132);
		mlaDetails.add(dto133);
		mlaDetails.add(dto134);
		mlaDetails.add(dto135);
		mlaDetails.add(dto136);
		mlaDetails.add(dto137);
		mlaDetails.add(dto138);
		mlaDetails.add(dto139);
		mlaDetails.add(dto140);

		mlaDetails.add(dto141);
		mlaDetails.add(dto142);
		mlaDetails.add(dto143);
		mlaDetails.add(dto144);
		mlaDetails.add(dto145);
		mlaDetails.add(dto146);
		mlaDetails.add(dto147);
		mlaDetails.add(dto148);
		mlaDetails.add(dto149);
		mlaDetails.add(dto150);

		mlaDetails.add(dto151);
		mlaDetails.add(dto152);
		mlaDetails.add(dto153);
		mlaDetails.add(dto154);
		mlaDetails.add(dto155);
		mlaDetails.add(dto156);
		mlaDetails.add(dto157);
		mlaDetails.add(dto158);
		mlaDetails.add(dto159);
		mlaDetails.add(dto160);

		mlaDetails.add(dto161);
		mlaDetails.add(dto162);
		mlaDetails.add(dto163);
		mlaDetails.add(dto164);
		mlaDetails.add(dto165);
		mlaDetails.add(dto166);
		mlaDetails.add(dto167);
		mlaDetails.add(dto168);
		mlaDetails.add(dto169);
		mlaDetails.add(dto170);

		mlaDetails.add(dto171);
		mlaDetails.add(dto172);
		mlaDetails.add(dto173);
		mlaDetails.add(dto174);
		mlaDetails.add(dto175);
		mlaDetails.add(dto176);
		mlaDetails.add(dto177);
		mlaDetails.add(dto178);
		mlaDetails.add(dto179);
		mlaDetails.add(dto180);

		mlaDetails.add(dto181);
		mlaDetails.add(dto182);
		mlaDetails.add(dto183);
		mlaDetails.add(dto184);
		mlaDetails.add(dto185);
		mlaDetails.add(dto186);
		mlaDetails.add(dto187);
		mlaDetails.add(dto188);
		mlaDetails.add(dto189);
		mlaDetails.add(dto190);

		mlaDetails.add(dto191);
		mlaDetails.add(dto192);
		mlaDetails.add(dto193);
		mlaDetails.add(dto194);
		mlaDetails.add(dto195);
		mlaDetails.add(dto196);
		mlaDetails.add(dto197);
		mlaDetails.add(dto198);
		mlaDetails.add(dto199);
		mlaDetails.add(dto200);

		mlaDetails.add(dto201);
		mlaDetails.add(dto202);
		mlaDetails.add(dto203);
		mlaDetails.add(dto204);
		mlaDetails.add(dto205);
		mlaDetails.add(dto206);
		mlaDetails.add(dto207);
		mlaDetails.add(dto208);
		mlaDetails.add(dto209);
		mlaDetails.add(dto210);

		mlaDetails.add(dto211);
		mlaDetails.add(dto212);
		mlaDetails.add(dto213);
		mlaDetails.add(dto214);
		mlaDetails.add(dto215);
		mlaDetails.add(dto216);
		mlaDetails.add(dto217);
		mlaDetails.add(dto218);
		mlaDetails.add(dto219);
		mlaDetails.add(dto220);

		mlaDetails.add(dto221);
		mlaDetails.add(dto222);
		mlaDetails.add(dto223);
		mlaDetails.add(dto224);

		System.out.println("Total no of MLA in karnataka: " + mlaDetails.size());

		System.out.println("------------------- MLAs of age grater than 50-------------");
		mlaDetails.stream().filter(ref -> ref.getAge() > 50).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("------------------------ MLAs of age less than 50-------------");
		mlaDetails.stream().filter(ref -> ref.getAge() < 50).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("------------------------------ Male MLAs---------------------------");
		mlaDetails.stream().filter(ref -> ref.getGender().equals("male")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("------------------- Female MLAs-------------");
		mlaDetails.stream().filter(ref -> ref.getGender().equals("female")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("-------------------Sorting by ascending order of party-------------");
		mlaDetails.stream().sorted((ref1, ref2) -> ref1.getParty().compareTo(ref2.getParty()))
				.collect(Collectors.toList()).forEach(element -> System.out.println(element));

		System.out.println("-------------------Sorting name by ascending order -------------");
		mlaDetails.stream().sorted((ref1, ref2) -> ref1.getName().compareTo(ref2.getName()))
				.collect(Collectors.toList()).forEach(element -> System.out.println(element));

		System.out.println("---------------------------Sorting age by descending order ------------------------------");
		mlaDetails.stream().sorted((ref1, ref2) -> ref2.getAge().compareTo(ref1.getAge())).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

		System.out.println("-------------------------------Unique parties-------------------------");
		mlaDetails.stream().map(element -> element.getParty()).distinct().collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

		System.out.println("------------------- MLAs are grater than 50 in BJP party-------------");
		mlaDetails.stream().filter(ref -> ref.getAge() > 50 && ref.getParty().contains("BJP"))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));

		System.out.println("---------------all mla's of BJP------------------------------------");
		mlaDetails.stream().filter(ref -> ref.getParty().contains("BJP")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

	}

}
