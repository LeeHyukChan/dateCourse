dateCourse/src/main/webapp/index.html
파일을 실행후 join 버튼을 누르시면 실행할 수 있습니다.

--아래는 테이블 목록 입니다 --
DROP TABLE rest;

CREATE TABLE rest (
  rcode number(4) primary key,
  rtype VARCHAR2(200) NOT NULL,
  rname VARCHAR2(200) NOT NULL,
  rplace VARCHAR2(200) NOT NULL,
  rlong VARCHAR2(200),
  rlati VARCHAR2(200)
);

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2000,'한식', '옥동식 합정', '서울특별시 마포구 서교동 385-6', '37.552649', '126.914512');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2001,'한식', '소이연남 본점', '서울특별시 마포구 연남동 229-67 1층', '37.563504', '126.925399');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2002,'한식', '이치류', '서울특별시 마포구 서교동 395-124', '37.550602', '126.919122');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2003,'한식', '하카타나카', '서울특별시 마포구 서교동 346-36', '37.555029', '126.923717');

I'NS'ERT INTO r'est (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2004,'한식', '라멘트럭', '서울특별시 마포구 상수동 328-7', '37.547165', '126.922681');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2005,'한식', '행진', '서울특별시 마포구 합정동 427-5', '37.553652', '126.911611');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2006,'한식', '우아하게홍대', '서울특별시 마포구 동교동 201-53', '37.557084', '126.921818');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2007,'한식', '단디', '서울특별시 마포구 연남동 229-10', '37.563358', '126.925265');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2008,'한식', '묘한식탁', '서울특별시 마포구 합정동 391-5', '37.550418', '126.909712');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2009,'한식', '홍스쭈꾸미', '서울시 마포구 서교동 331-21', '37.556162', '126.926103');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2010,'한식', '메종브리크', '서울특별시 마포구 연남동 390-28 2층', '37.561934', '126.925967');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2011,'한식', '도마', '서울특별시 마포구 서교동 357-3', '37.553064', '126.921436');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2012,'한식', '풀뜯는돼지', '서울특별시 마포구 연남동 260-46', '37.560806', '126.924746');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2013,'한식', '향원정', '서울특별시 마포구 서교동 386-10', '37.551956', '126.914648');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2014,'한식', '철길왕갈비살', '서울시 마포구 창전동 4-2', '37.549524', '126.931721');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2015,'한식', '구공탄곱창', '서울시 마포구 서교동 400-12', '37.548592', '126.918539');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2016,'한식', '하연옥', '서울시 마포구 서교동 464-46 1층', '37.555046', '126.917275');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2017,'한식', '들풀 한상', '서울특별시 마포구 서교동 351-16', '37.555466', '126.919788');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2018,'한식', '도적', '서울시 마포구 서교동 402-17', '37.548754', '126.920159');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2019,'한식', '남북통일', '서울시 마포구 서교동 '375-26', ''3'7.553804',' '126.917963');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2020,'일식', '오레노라멘', '서울특별시 마포구 합정동 361-1', '37.547485', '126.917282');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2021,'일식', '잇텐고', '서울특별시 마포구 합정동 396-14', '37.549278', '126.909189');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2022,'일식', '담택', '서울특별시 마포구 서교동 381-22', '37.553180', '126.914162');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2023,'일식', '카와카츠', '서울특별시 마포구 서교동 465-1', '37.554756', '126.916258');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2024,'일식', '규자카야', '서울특별시 마포구 연남동 224-26 2층', '37.563817', '126.926277');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2025,'일식', '크레이지카츠', '서울특별시 마포구 합정동 391-5', '37.550428', '126.909724');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2026,'일식', '츠키젠', '서울 마포구 합정동 355-15', '37.546804', '126.918061');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2027,'일식', '은행골', '서울특별시 마포구 서교동 409-14', '37.549160', '126.921504');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2028,'일식', '연어롭다', '서울특별시 마포구 연남동 382-19', '37.561034', '126.925688');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2029,'일식', '기요한', '서울특별시 마포구 서교동 480-6', '37.554094', '126.912424');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2030,'일식', '정돈', '서울특별시 마포구 서교동 408-26', '37.549040', '126.921008');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2031,'일식', '칸다소바', '서울시 마포구 상수동 91-3', '37.549264', '126.922673');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2032,'일식', '쿄 라멘', '서울특별시 마포구 연남동 385-4', '37.562276', '126.926169');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2033,'일식', '고쿠텐', '서울특별시 마포구 동교동 201-41', '37.557402', '126.921187');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2034,'일식', '카쿠시타', '서울특별시 마포구 연남동 390-30', '37.561853', '126.926140');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2035,'일식', '가츠시', '서울특별시 마포구 서교동 464-40', '37.554777', '126.916836');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2036,'일식', '세상끝의 라멘', '서울특별시 마포구 서교동 391-18', '37.551491', '126.915233');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (20'37,'일식', ''무'라 2호점', '서'울특별시 마포구 서교동 411-12', '37.555181', '126.929444');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2038,'일식', '여우골', '서울특별시 마포구 서교동 363-24', '37.551092', '126.922619');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2039,'일식', '카레시', '서울특별시 마포구 서교동 404-14', '37.549651', '126.920229');


INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2040,'중식', '미도인 홍대', '서울특별시 마포구 서교동 366-24', '37.551666', '126.920960');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2041,'중식', '맛이차이나', '서울특별시 마포구 상수동 321-1 2층', '37.547551', '126.920906');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2042,'중식', '연교', '서울특별시 마포구 연남동 383-95 1층', '37.561567', '126.926670');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2043,'중식', '진진', '서울특별시 마포구 서교동 '375-35 1층'',' '37.55776'5', '126.913254');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2044,'중식', '중화복춘 골드', '서울특별시 마포구 동교동 152-11', '37.558701', '126.920806');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2045,'중식', '타오 마라탕', '서울특별시 마포구 서교동 394-93', '37.552412', '126.922368');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2046,'중식', '만두란', '서울특별시 마포구 망원동 386-5', '37.554149', '126.911052');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2047,'중식', '진만두', '서울특별시 마포구 서교동 327-22', '37.555149', '126.929278');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2048,'중식', '히츠지야', '서울특별시 마포구 서교동 395-36 1층', '37.529273', '126.916824');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2049,'중식', '부탄츄', '서울특별시 마포구 서교동 330-19', '37.556343', '126.926758');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2050,'중식', '가원', '서울특별시 마포구 망원동 386-2', '37.554859', '126.910844');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2051,'중식', '하하', '서울특별시 마포구 연남동 229-12', '37.563185', '126.925069');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2052,'중식', '월량관', '서울 마포구 연남동 387-45 1층', '37.562472', '126.925283');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2053,'중식', '몽중식', '서울 마포구 연남동 227-15', '37.562778', '126.924647');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2054,'중식', '림가기', '서울특별시 마포구 서교동 327-45', '37.555031', '126.929422');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2055,'중식', '신룽푸 마라탕', '서울특별시 마포구 서교동 486', '37.553636', '126.92'377'5);

I'NS'ERT INTO r'est (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2056,'중식', '향미', '서울특별시 마포구 연남동 226-21', '37.562866', '126.926730');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2057,'중식', '솔솥', '서울특별시 마포구 연남동 390-42', '37.561311', '126.925800');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2058,'중식', '초마', '서울특별시 마포구 서교동 361-10 2층', '37.550861', '126.923428');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2059,'중식', '하이디라오', '서울특별시 마포구 동교동 166-14', '37.557158', '126.924815');


INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2060,'양식', '윤씨밀방', '서울특별시 마포구 서교동 411-6', '37.549597', '126.922354');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2061,'양식', '스파카 나폴리', '서울특별시 마포구 합정동 413-2', '37.548268', '126.911179');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2062,'양식', '쨈지달', '서울특별시 마포구 연남동 390-57', '37.562147', '126.925402');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2063,'양식', '브뤼서리 서교', '서울특별시 마포구 서교동 476-44', '37.555089', '126.911681');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2064,'양식', '프리모 바치오바치', '서울특별시 마포구 서교동 346-47 2층', '37.555693', '126.923052');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2065,'양식', '몰토베네', '서울특별시 마포구 합정동 361-20', '37.546197', '126.916642');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2066,'양식', '비스트로주라', '서울특별시 마포구 서교동 342-16', '37.554021', '126.924608');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2067,'양식', '문', '서울특별시 마포구 연남동 385-12', '37.562299', '126.925901');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2068,'양식', '멕시칸식당 베르데', '서울특별시 마포구 연남동 387-13', '37.562823', '126.925439');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2069,'양식', '쉐시몽', '서울특별시 마포구 서교동 478-3', '37.555221', '126.914214');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2070,'양식', '뉴오더클럽', '서울특별시 마포구 연남동 260-31', '37.561047', '126.924508');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2071,'양식', '묘한식탁', '서울특별시 마포구 합정동 391-5', '37.550469', '126.909731');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2072,'양식', '제스티살룬', '서울특별시 마포구 서교동 358-121', '37.561683', '126.926878');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2073,'양식', '감성타코', '서울특별시 마포구 서교동 358-121', '37.551273', '126.912008');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2074,'양식', '루나씨엘로', '서울특별시 마포구 연남동 381-5', '37.560852', '126.925492');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2075,'양식', '테이커테이블', '서울특별시 마포구 동교동 150-2 테이커테이블 1층', '37.560475', '126.924550');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2076,'양식', '서울브루어리', '서울특별시 마포구 합정동 368-10', '37.545897', '126.914629');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2077,'양식', '219 다이닝 레스토랑', '서울특별시 마포구 서교동 395-115', '37.550704', '126.919265');

INSERT INTO rest (rcode,rtype, rname, rplace, rlati, rlong)
VALUES (2078,'양식', '카밀로라자네리아', '서울특별시 마포구 서교동 382-13', '37.552544', '126.912938');

commit;

------------------------------------------------------------------------------------
drop table course;

Create table course(
name varchar2(20),
rest varchar2(20),
fest varchar2(20)
);
-------------------------------------------------------------------------------------
drop table isack;
CREATE TABLE isack (
   icode NUMBER(4) PRIMARY KEY,
   itype VARCHAR2(200) NOT NULL,
   iname VARCHAR2(200) NOT NULL,
   iplace VARCHAR2(200) NOT NULL,
   ilong VARCHAR2(200),
   ilati VARCHAR2(200)
);


INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2000, '야간동물원', '서울대공원 야간 동물원', '경기도 과천시 대공원광장로 102', '37.426523', '127.019855');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2001, '야간동물원', '서울랜드 야간 동물원', '경기도 과천시 벌말로 166', '37.436408', '127.003446');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2002, '야간동물원', '서울동물원 야간 관람', '서울특별시 광진구 능동로 159', '37.541715', '127.076082');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2003, '야간동물원', '양재천 야간 동물원', '서울특별시 서초구 언남동 14-2', '37.472071', '127.039936');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2004, '야간동물원', '헤이리자연생태공원 야간 동물원', '경기도 파주시 와석순환로 243-40', '37.775496', '126.680032');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2005, '야간동물원', '경춘선생태공원 야간 관람', '경기도 남양주시 와부읍 호국로 2715', '37.645381', '127.240100');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2006, '야간동물원', '동물원골목 야간 동물원', '경기도 하남시 감일로 109번길', '37.530835', '127.222457');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2007, '야간동물원', '도봉산 국립공원 야간 동물원', '서울특별시 도봉구 도봉동', '37.700507', '127.017834');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2008, '야간동물원', '아쿠아리움63 야간 동물원', '서울특별시 영등포구 63로 50 (63빌딩)', '37.519679', '126.940114');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2009, '야간동물원', '동물원 & 아쿠아리움 야간 관람', NULL, NULL, NULL);


INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3000, '랜선 요리 클래스', '맛있는 비법 요리', '서울특별시 강남구 역삼동 123-45', '37.123456', '127.654321');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3001, '랜선 요리 클래스', '디저트 마스터', '서울특별시 서초구 방배동 987-65', '37.987654', '127.123456');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3002, '랜선 요리 클래스', '한식 퓨전 요리', '서울특별시 마포구 홍대입구역 789-12', '37.543210', '126.987654');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3003, '랜선 요리 클래스', '베이킹 레슨', '서울특별시 종로구 인사동 456-78', '37.654321', '126.876543');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3004, '랜선 요리 클래스', '양식 요리 입문', '서울특별시 강동구 천호동 789-12', '37.765432', '126.765432');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3005, '랜선 요리 클래스', '아시아 음식 탐험', '서울특별시 중구 명동 345-67', '37.876543', '126.654321');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3006, '랜선 요리 클래스', '건강한 채식 요리', '서울특별시 영등포구 여의도동 123-45', '37.987654', '126.543210');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3007, '랜선 요리 클래스', '차 마스터', '서울특별시 송파구 잠실동 987-65', '37.876543', '126.432109');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3008, '랜선 요리 클래스', '퓨전 디저트', '서울특별시 강서구 화곡동 456-78', '37.765432', '126.321098');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (3009, '랜선 요리 클래스', '세계 음식 여행', '서울특별시 노원구 상계동 789-12', '37.654321', '126.210987');


INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2010, '테마 카페', '플라워 카페', '서울특별시 강남구 강남대로 1234', '37.521485', '127.021215');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2011, '테마 카페', '북카페', '서울특별시 마포구 어울마당로 56', '37.553205', '126.921930');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2012, '테마 카페', '고양이 카페', '서울특별시 종로구 고양이길 7', '37.570812', '126.984500');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2013, '테마 카페', '게임 카페', '서울특별시 영등포구 게임로 32', '37.517300', '126.905410');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2014, '테마 카페', '로봇 카페', '서울특별시 송파구 로봇로 9', '37.500532', '127.098173');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2015, '테마 카페', '어반 가든 카페', '서울특별시 강동구 어반로 42', '37.556789', '127.144961');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2016, '테마 카페', '인형 카페', '서울특별시 성북구 인형로 21', '37.592431', '127.017642');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2017, '테마 카페', '뮤지엄 카페', '서울특별시 강서구 뮤지엄로 88', '37.552603', '126.839234');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2018, '테마 카페', '빈티지 카페', '서울특별시 용산구 빈티지길 3', '37.540219', '126.980966');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2019, '테마 카페', '해변 카페', '서울특별시 서초구 해변로 55', '37.500932', '127.015671');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2020, '자전거 데이트', '한강 자전거길', '서울특별시 용산구 한남동 한강대로 40', '37.533027', '127.001612');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2021, '자전거 데이트', '북악스카이웨이', '서울특별시 종로구 성균관로 16-1', '37.582419', '126.950485');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2022, '자전거 데이트', '청계천 자전거로', '서울특별시 종로구 서린동 청계천로', '37.569014', '127.022432');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2023, '자전거 데이트', '서울숲 자전거 대여소', '서울특별시 성동구 성수동1가 아차산로 95', '37.546547', '127.040783');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2024, '자전거 데이트', '월드컵공원 자전거 경로', '서울특별시 마포구 성산동 월드컵로 240', '37.568021', '126.883291');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2025, '자전거 데이트', '올림픽공원 자전거 대여소', '서울특별시 송파구 방이동 115-1', '37.515205', '127.121767');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2026, '자전거 데이트', '난지천 자전거길', '서울특별시 마포구 상암동 1724', '37.571271', '126.889120');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2027, '자전거 데이트', '동작대교 자전거 도로', '서울특별시 동작구 여의도동 한강대로', '37.514777', '126.939657');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2028, '자전거 데이트', '용산 전망대 자전거길', '서울특별시 용산구 후암동 한강대로 405', '37.542279', '126.981831');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2029, '자전거 데이트', '아차산 자전거 트레일', '서울특별시 광진구 군자동 아차산로 290', '37.548835', '127.072223');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2040, '별보기 데이트', '남산골한옥마을 전망대', '서울특별시 중구 퇴계로34길 28', '37.559034', '126.989872');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2041, '별보기 데이트', '남산서울타워', '서울특별시 용산구 남산공원길 105', '37.551169', '126.988230');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2042, '별보기 데이트', '국립중앙과학관 천체관층', '서울특별시 용산구 어린이대공원로 267', '37.539286', '127.078935');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2043, '별보기 데이트', '하늘공원', '서울특별시 마포구 상암동 월드컵북로 108', '37.570526', '126.878972');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2044, '별보기 데이트', '봉은사 & 서울빛초롱축제', '서울특별시 강남구 삼성동 봉은사로 531', '37.515271', '127.057852');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2045, '별보기 데이트', '서울 숲 라이프센터', '서울특별시 성동구 성수동1가 아차산로 95', '37.547220', '127.041029');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2046, '별보기 데이트', '대모산 천문대', '경기도 의왕시 내손동', '37.355936', '126.948601');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2047, '별보기 데이트', '관악산 전망대', '서울특별시 관악구 신림동 관악산로 1길 42', '37.445456', '126.964226');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2048, '별보기 데이트', '용마폭포공원', '서울특별시 중랑구 면목동 용마산로 515', '37.573431', '127.086704');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2049, '별보기 데이트', '한양도성성곽길', '서울특별시 성동구 행당동 한양성곽길', '37.561598', '127.041556');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2050, '예술 클래스', '파스텔 드로잉 클래스', '서울특별시 강남구 역삼동 논현로93길 17', '37.498493', '127.031226');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2051, '예술 클래스', '캔들 아트 클래스', '서울특별시 마포구 망원동 월드컵로 69', '37.555036', '126.908464');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2052, '예술 클래스', '뮤지컬 배우기 클래스', '서울특별시 강동구 성내동 성내로 32', '37.527800', '127.124193');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2053, '예술 클래스', '유화 그리기 클래스', '서울특별시 서대문구 신촌동 이화여대길 52', '37.560006', '126.946287');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2054, '예술 클래스', '포토그래피 스튜디오', '서울특별시 용산구 이태원동 녹사평대로 202', '37.538356', '126.988617');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2055, '예술 클래스', '파빈드 모자이크 클래스', '서울특별시 종로구 통인동 자하문로9길 26', '37.572202', '126.968272');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2056, '예술 클래스', '피아노 연주 강습', '서울특별시 강서구 마곡동 공항대로 61길 29', '37.560743', '126.827332');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2057, '예술 클래스', '캘리그라피 워크샵', '서울특별시 송파구 거여동 동남로 328', '37.500209', '127.144117');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2058, '예술 클래스', '동양화 수채화 강습', '서울특별시 중구 서소문동 세종대로 110', '37.560025', '126.975607');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2059, '예술 클래스', '가죽공예 클래스', '서울특별시 용산구 이태원로 194', '37.537759', '126.992816');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2100, '역사적인 장소', '경복궁', '서울특별시 종로구 세종로 사직로 161', '37.579100', '126.977945');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2101, '역사적인 장소', '창덕궁', '서울특별시 종로구 와룡동 율곡로 99', '37.582604', '126.991815');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2102, '역사적인 장소', '덕수궁', '서울특별시 중구 세종대로 99', '37.565679', '126.975559');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2103, '역사적인 장소', '창경궁', '서울특별시 종로구 와룡동 창경궁로 185', '37.578043', '126.999283');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2104, '역사적인 장소', '종묘', '서울특별시 종로구 종로 가회동 159', '37.572350', '126.990606');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2105, '역사적인 장소', '서울성곽길', '서울특별시 중구 소공로 129', '37.554629', '126.972608');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2106, '역사적인 장소', '서대문형무소역사관', '서울특별시 서대문구 통일로 251', '37.572404', '126.956716');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2107, '역사적인 장소', '남산골한옥마을', '서울특별시 중구 퇴계로34길 28', '37.559716', '126.994781');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2108, '역사적인 장소', '서울특별시청', '서울특별시 중구 세종대로 110', '37.566295', '126.977945');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2109, '역사적인 장소', '덕수궁돌담길', '서울특별시 중구 정동 수표로1길 15', '37.566237', '126.976993');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2200, '테마 공원', '에버랜드', '경기도 용인시 처인구 포곡읍 에버랜드로 199', '37.293247', '127.202727');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2201, '테마 공원', '롯데월드', '서울특별시 송파구 잠실동 올림픽로 240', '37.511387', '127.098859');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2202, '테마 공원', '경기 월드 캘리포니아 비치', '경기도 광주시 남한산성면 와부읍 여곡리 456-1', '37.343442', '127.289384');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2203, '테마 공원', '서울랜드', '경기도 과천시 벌말로 166', '37.435673', '127.013742');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2204, '테마 공원', '헤이리예술마을', '경기도 파주시 헤이리마을길 33', '37.800915', '126.766287');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2205, '테마 공원', '서울 서부 화랑로 가로수길', '서울특별시 양천구 신월동 화랑로 309-7', '37.538701', '126.831150');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2206, '테마 공원', '송파파크하비오', '서울특별시 송파구 잠실로 181', '37.504516', '127.090366');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2207, '테마 공원', '안산 와우정사', '경기도 안산시 단원구 와우정사길 20', '37.298718', '126.859932');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2208, '테마 공원', '안산 임진각', '경기도 안산시 상록구 임진각로 36', '37.315581', '126.774529');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2209, '테마 공원', '관악산 둘레길', '서울특별시 관악구 남부순환로 1636', '37.449754', '126.953874');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2300, '농장 체험', '팜랜드', '경기도 광주시 도척면 우리길 111', '37.391667', '127.249863');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2301, '농장 체험', '서울 농업기술센터', '서울특별시 강서구 강서로56길 36', '37.558759', '126.848052');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2302, '농장 체험', '종로 농협 체험농장', '서울특별시 종로구 평창동 504-4', '37.611972', '126.960220');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2303, '농장 체험', '허브나라', '경기도 파주시 문산읍 온정리 622-1', '37.768853', '126.743839');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2304, '농장 체험', '한국농어촌공사 청송사업지원단', '경기도 양주시 남면 와동리 337-4', '37.747606', '127.097015');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2305, '농장 체험', '안성 양떼목장', '경기도 안성시 죽산면 양떼목장길 118', '37.038513', '127.266903');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2306, '농장 체험', '두물머리 양떼목장', '경기도 양주시 광적면 두물머리길 1162-51', '37.813011', '127.044685');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2307, '농장 체험', '더풍성목장', '경기도 이천시 마장면 목장길 154-21', '37.232923', '127.346698');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2308, '농장 체험', '백호농장', '경기도 파주시 탄현면 벌교리 308-1', '37.766872', '126.771964');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2309, '농장 체험', '파주 채소체험농장', '경기도 파주시 교하읍 월롱리 300-1', '37.783155', '126.712042');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2400, '뮤지컬/오페라 감상', '롯데콘서트홀', '서울특별시 송파구 올림픽로 240 롯데월드몰 9층', '37.513496', '127.102309');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2401, '뮤지컬/오페라 감상', '블루스퀘어 인터파크홀', '서울특별시 서초구 신반포로 176', '37.504095', '127.000448');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2402, '뮤지컬/오페라 감상', '대학로예술극장', '서울특별시 종로구 대학로 118', '37.582701', '127.000058');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2403, '뮤지컬/오페라 감상', '충무아트센터 대극장', '서울특별시 서대문구 통일로 219', '37.564282', '126.967827');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2404, '뮤지컬/오페라 감상', '세종문화회관 대극장', '서울특별시 종로구 새문안로 81', '37.572635', '126.976889');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2405, '뮤지컬/오페라 감상', '예술의전당 오페라극장', '서울특별시 서초구 남부순환로 2406', '37.478315', '127.009070');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2406, '뮤지컬/오페라 감상', '예스24스테이지', '서울특별시 마포구 양화로 155 YES24 라이브홀', '37.546499', '126.945833');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2407, '뮤지컬/오페라 감상', '대한민국 국립극단', '서울특별시 서대문구 통일로 50 대한민국 국립극장', '37.573394', '126.961908');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2408, '뮤지컬/오페라 감상', '백석예술대학교 대극장', '경기도 안산시 상록구 한양대학로 253', '37.316353', '126.835302');

INSERT INTO isack (icode, itype, iname, iplace, ilati, ilong)
VALUES (2409, '뮤지컬/오페라 감상', '국립중앙극장 대극장', '서울특별시 중구 퇴계로 87', '37.566282', '126.976965');

ALTER TABLE isack
ADD content VARCHAR(255);

UPDATE isack
SET content = '서울대공원 야간 동물원의 장점: 야간에 동물들의 활동을 관찰할 수 있다.'
WHERE icode = 2000;

UPDATE isack
SET content = '서울랜드 야간 동물원의 장점: 놀이기구와 동물들을 함께 즐길 수 있다.'
WHERE icode = 2001;

UPDATE isack
SET content = '서울동물원 야간 관람의 장점: 도심 속에서 다양한 동물들을 만날 수 있다.'
WHERE icode = 2002;

UPDATE isack
SET content = '양재천 야간 동물원의 장점: 아름다운 야경과 함께 동물들을 감상할 수 있다.'
WHERE icode = 2003;

UPDATE isack
SET content = '헤이리자연생태공원 야간 동물원의 장점: 자연과 함께하는 특별한 야간 체험을 즐길 수 있다.'
WHERE icode = 2004;

UPDATE isack
SET content = '경춘선생태공원 야간 관람의 장점: 여러 종류의 야생동물들을 만날 수 있다.'
WHERE icode = 2005;

UPDATE isack
SET content = '동물원골목 야간 동물원의 장점: 다양한 동물들을 가까이서 관찰할 수 있다.'
WHERE icode = 2006;

UPDATE isack
SET content = '도봉산 국립공원 야간 동물원의 장점: 자연과 함께하는 야간 하이킹을 즐길 수 있다.'
WHERE icode = 2007;

UPDATE isack
SET content = '아쿠아리움63 야간 동물원의 장점: 아름다운 수족관과 동물들을 함께 관람할 수 있다.'
WHERE icode = 2008;

UPDATE isack
SET content = '동물원 & 아쿠아리움 야간 관람의 장점: 다양한 동물들과 수족관을 한번에 즐길 수 있다.'
WHERE icode = 2009;


UPDATE isack
SET content = '서울대공원 야간 동물원의 장점: 야간에 동물들의 활동을 관찰할 수 있다.'
WHERE icode = 2000;

UPDATE isack
SET content = '서울랜드 야간 동물원의 장점: 놀이기구와 동물들을 함께 즐길 수 있다.'
WHERE icode = 2001;

UPDATE isack
SET content = '서울동물원 야간 관람의 장점: 도심 속에서 다양한 동물들을 만날 수 있다.'
WHERE icode = 2002;

UPDATE isack
SET content = '양재천 야간 동물원의 장점: 아름다운 야경과 함께 동물들을 감상할 수 있다.'
WHERE icode = 2003;

UPDATE isack
SET content = '헤이리자연생태공원 야간 동물원의 장점: 자연과 함께하는 특별한 야간 체험을 즐길 수 있다.'
WHERE icode = 2004;

UPDATE isack
SET content = '경춘선생태공원 야간 관람의 장점: 여러 종류의 야생동물들을 만날 수 있다.'
WHERE icode = 2005;

UPDATE isack
SET content = '동물원골목 야간 동물원의 장점: 다양한 동물들을 가까이서 관찰할 수 있다.'
WHERE icode = 2006;

UPDATE isack
SET content = '도봉산 국립공원 야간 동물원의 장점: 자연과 함께하는 야간 하이킹을 즐길 수 있다.'
WHERE icode = 2007;

UPDATE isack
SET content = '아쿠아리움63 야간 동물원의 장점: 아름다운 수족관과 동물들을 함께 관람할 수 있다.'
WHERE icode = 2008;

UPDATE isack
SET content = '동물원 & 아쿠아리움 야간 관람의 장점: 다양한 동물들과 수족관을 한번에 즐길 수 있다.'
WHERE icode = 2009;

UPDATE isack
SET content = '맛있는 비법 요리는 입맛을 만족시키는 다양한 레시피를 배울 수 있는 클래스입니다. 전문 요리사가 직접 가르치기 때문에 높은 퀄리티의 요리를 배울 수 있습니다.'
WHERE icode = 3000;

UPDATE isack
SET content = '디저트 마스터 클래스는 달콤한 디저트를 전문적으로 배울 수 있는 기회를 제공합니다. 다양한 종류의 디저트 레시피를 익히고 스킬을 향상시킬 수 있습니다.'
WHERE icode = 3001;

UPDATE isack
SET content = '한식 퓨전 요리 클래스는 한국의 전통적인 음식과 다른 문화의 특색을 조합한 퓨전 요리를 배울 수 있는 클래스입니다. 창의적인 요리 경험을 즐길 수 있습니다.'
WHERE icode = 3002;

UPDATE isack
SET content = '베이킹 레슨은 디저트와 빵을 만드는 베이킹 기술을 배울 수 있는 클래스입니다. 다양한 베이킹 레시피와 기법을 익혀 자신만의 디저트를 만들 수 있습니다.'
WHERE icode = 3003;

UPDATE isack
SET content = '양식 요리 입문 클래스는 서양 음식을 처음 접하는 분들을 위한 클래스입니다. 양식 요리의 기초를 배우고 다양한 요리 스타일을 익힐 수 있습니다.'
WHERE icode = 3004;

UPDATE isack
SET content = '아시아 음식 탐험 클래스는 아시아 각국의 다양한 음식을 배우고 체험할 수 있는 기회를 제공합니다. 아시아 음식의 다양성과 매력을 느낄 수 있습니다.'
WHERE icode = 3005;

UPDATE isack
SET content = '건강한 채식 요리 클래스는 채소와 곡물 등을 활용하여 영양가 있는 요리를 배울 수 있습니다. 건강과 맛을 모두 고려한 요리를 만들 수 있습니다.'
WHERE icode = 3006;

UPDATE isack
SET content = '차 마스터 클래스는 다양한 종류의 차를 맛보고 차의 역사와 문화를 배울 수 있는 기회를 제공합니다. 차를 마시며 여유로운 시간을 보낼 수 있습니다.'
WHERE icode = 3007;

UPDATE isack
SET content = '퓨전 디저트 클래스는 서양 디저트와 한국의 특색을 결합한 창의적인 디저트를 배울 수 있는 클래스입니다. 독특한 맛의 디저트를 만들어낼 수 있습니다.'
WHERE icode = 3008;

UPDATE isack
SET content = '세계 음식 여행 클래스는 다양한 국가의 음식을 탐험하고 그 문화를 배울 수 있는 기회를 제공합니다. 세계 각국의 맛과 멋을 즐길 수 있습니다.'
WHERE icode = 3009;


UPDATE isack
SET content = '롯데콘서트홀은 서울특별시 송파구에 위치한 뮤지컬과 콘서트를 즐길 수 있는 공연장입니다.'
WHERE icode = 2400;

UPDATE isack
SET content = '블루스퀘어 인터파크홀은 서울특별시 서초구에 위치한 다양한 공연을 관람할 수 있는 공연장입니다.'
WHERE icode = 2401;

UPDATE isack
SET content = '대학로예술극장은 서울특별시 종로구 대학로에 위치한 대규모 극장으로서 다양한 연극과 뮤지컬을 감상할 수 있습니다.'
WHERE icode = 2402;

UPDATE isack
SET content = '충무아트센터 대극장은 서울특별시 서대문구에 위치한 대규모 공연장으로서 뮤지컬과 연극을 즐길 수 있는 곳입니다.'
WHERE icode = 2403;

UPDATE isack
SET content = '세종문화회관 대극장은 서울특별시 종로구에 위치한 공연장으로서 다양한 뮤지컬과 연극을 감상할 수 있습니다.'
WHERE icode = 2404;

UPDATE isack
SET content = '예술의전당 오페라극장은 서울특별시 서초구에 위치한 공연장으로서 다양한 오페라와 음악공연을 감상할 수 있습니다.'
WHERE icode = 2405;

UPDATE isack
SET content = '예스24스테이지는 서울특별시 마포구에 위치한 라이브홀로서 다양한 공연과 콘서트를 즐길 수 있는 공간입니다.'
WHERE icode = 2406;

UPDATE isack
SET content = '대한민국 국립극단은 서울특별시 서대문구에 위치한 국립극장으로서 다양한 연극과 뮤지컬을 감상할 수 있는 장소입니다.'
WHERE icode = 2407;

UPDATE isack
SET content = '백석예술대학교 대극장은 경기도 안산시에 위치한 대규모 극장으로서 학생들의 공연과 다양한 문화행사가 열리는 곳입니다.'
WHERE icode = 2408;

UPDATE isack
SET content = '국립중앙극장 대극장은 서울특별시 중구에 위치한 대규모 공연장으로서 다양한 연극과 뮤지컬을 감상할 수 있습니다.'
WHERE icode = 2409;

UPDATE isack
SET content = '팜랜드는 경기도 광주시에 위치한 농장 체험장으로서 다양한 농작물과 동물과의 교감을 즐길 수 있는 곳입니다.'
WHERE icode = 2300;

UPDATE isack
SET content = '서울 농업기술센터는 강서구에 위치한 농업 기술 관련 체험을 할 수 있는 장소입니다.'
WHERE icode = 2301;

UPDATE isack
SET content = '종로 농협 체험농장은 서울 종로구에 위치한 농장 체험장으로서 도심 속에서 농업과 자연을 경험할 수 있는 곳입니다.'
WHERE icode = 2302;

UPDATE isack
SET content = '허브나라는 경기도 파주시에 위치한 허브 테마 농장으로서 다양한 허브와 화원을 즐길 수 있는 장소입니다.'
WHERE icode = 2303;

UPDATE isack
SET content = '한국농어촌공사 청송사업지원단은 경기도 양주시에 위치한 농촌 체험을 할 수 있는 장소로서 농업과 관련된 다양한 프로그램이 운영됩니다.'
WHERE icode = 2304;

UPDATE isack
SET content = '안성 양떼목장은 경기도 안성시에 위치한 양 떼 목장으로서 양과의 교감과 풍경을 즐길 수 있는 장소입니다.'
WHERE icode = 2305;

UPDATE isack
SET content = '두물머리 양떼목장은 경기도 양주시에 위치한 양 떼 목장으로서 시원한 풍경과 양들과의 교감을 즐길 수 있는 곳입니다.'
WHERE icode = 2306;

UPDATE isack
SET content = '더풍성목장은 경기도 이천시에 위치한 목장으로서 목장에서 직접 생산하는 우유와 치즈를 맛볼 수 있습니다.'
WHERE icode = 2307;

UPDATE isack
SET content = '백호농장은 경기도 파주시에 위치한 농장으로서 풍경과 동물과의 교감을 즐길 수 있는 장소입니다.'
WHERE icode = 2308;

UPDATE isack
SET content = '파주 채소체험농장은 경기도 파주시에 위치한 농장으로서 다양한 채소와 텃밭 체험을 할 수 있는 장소입니다.'
WHERE icode = 2309;

UPDATE isack
SET content = '에버랜드는 한국의 대표적인 테마파크로서 다양한 놀이기구와 액티비티, 아름다운 정원 등이 인기 있는 곳입니다.'
WHERE icode = 2200;

UPDATE isack
SET content = '롯데월드는 서울에서 가장 큰 테마파크로서 다양한 놀이기구와 쇼, 쇼핑몰 등이 있는 대표적인 랜드마크입니다.'
WHERE icode = 2201;

UPDATE isack
SET content = '경기 월드 캘리포니아 비치는 캘리포니아 비치를 테마로 한 워터파크로서 시원한 물놀이와 즐거운 액티비티가 있는 곳입니다.'
WHERE icode = 2202;
UPDATE isack
SET content = '서울랜드는 서울 근교에 위치한 테마파크로서 가족들과 함께 다양한 놀이기구와 테마존을 즐길 수 있는 장소입니다.'
WHERE icode = 2203;

UPDATE isack
SET content = '헤이리예술마을은 예술가들이 모여 있는 작은 예술 마을로서 다양한 예술 체험과 전시가 있는 곳입니다.'
WHERE icode = 2204;

UPDATE isack
SET content = '서울 서부 화랑로 가로수길은 아름다운 가로수길과 다양한 상점들이 있는 곳으로 산책하기에 좋은 장소입니다.'
WHERE icode = 2205;

UPDATE isack
SET content = '송파파크하비오는 송파구에 위치한 대규모 공원으로서 자연과 휴식을 즐길 수 있는 장소입니다.'
WHERE icode = 2206;

UPDATE isack
SET content = '안산 와우정사는 안산시에 위치한 불교 사찰로서 아름다운 절과 조용한 분위기를 느낄 수 있는 곳입니다.'
WHERE icode = 2207;

UPDATE isack
SET content = '안산 임진각은 안산시에 위치한 역사적인 유적으로서 아름다운 경치와 역사적인 분위기를 느낄 수 있는 곳입니다.'
WHERE icode = 2208;

UPDATE isack
SET content = '관악산 둘레길은 서울 관악구 주변에 위치한 아름다운 산책로로서 산과 자연을 느낄 수 있는 곳입니다.'
WHERE icode = 2209;



UPDATE isack
SET content = '경복궁은 조선 왕조의 법궁으로서 아름다운 조선 시대의 건축물과 정원을 감상할 수 있는 대표적인 역사적인 장소입니다.'
WHERE icode = 2100;

UPDATE isack
SET content = '창덕궁은 조선 왕조의 창건자인 세종대왕과 세자(후의 세조)의 뜻을 담은 아름다운 전통 한옥 건축물과 화려한 정원으로 유명합니다.'
WHERE icode = 2101;

UPDATE isack
SET content = '덕수궁은 조선 왕조의 여덟 번째 군수인 현종이 건립한 궁궐로서 아름다운 정원과 조선 시대의 아름다운 건축물이 현존하는 곳입니다.'
WHERE icode = 2102;

UPDATE isack
SET content = '창경궁은 조선 시대의 정전지로서 아름다운 전통 한옥 건축물과 조선 왕조의 역사적인 유물을 볼 수 있는 역사적인 장소입니다.'
WHERE icode = 2103;

UPDATE isack
SET content = '종묘는 조선 왕조의 제례를 올리기 위한 특별한 장소로서 중국의 사적인 유명한 제사철이 모델로 되어 있습니다.'
WHERE icode = 2104;

UPDATE isack
SET content = '서울성곽길은 서울의 역사적인 성곽과 관련된 다양한 유적들을 걸으며 탐방할 수 있는 길입니다.'
WHERE icode = 2105;

UPDATE isack
SET content = '서대문형무소역사관은 일제 강점기에 일본으로부터 독립을 위해 희생한 독립 운동가들의 고물을 간직하고 있는 역사적인 장소입니다.'
WHERE icode = 2106;

UPDATE isack
SET content = '남산골한옥마을은 전통적인 한옥 건축물과 한국 전통 문화를 경험할 수 있는 아름다운 마을입니다.'
WHERE icode = 2107;

UPDATE isack
SET content = '서울특별시청은 서울의 중심지에 위치한 정부 건물로서 서울의 모든 시민들을 위해 열심히 일하는 곳입니다.'
WHERE icode = 2108;

UPDATE isack
SET content = '덕수궁돌담길은 덕수궁 주변에 위치한 아름다운 돌담길로서 한복을 입고 산책하기에 좋은 장소입니다.'
WHERE icode = 2109;


UPDATE isack
SET content = '파스텔 드로잉 클래스에서는 부드러운 색감과 그림의 텍스처를 표현하는 방법을 배우며 예술적 감각을 향상시킬 수 있습니다.'
WHERE icode = 2050;


UPDATE isack
SET content = '캔들 아트 클래스에서는 아로마 캔들 제작과 다양한 캔들 아트 기법을 배우며 손으로 만든 작품을 간직할 수 있습니다.'
WHERE icode = 2051;


UPDATE isack
SET content = '뮤지컬 배우기 클래스에서는 연기와 노래, 댄스 등 뮤지컬 공연에 필요한 다양한 기술을 익히며 무대 위의 스타가 될 수 있습니다.'
WHERE icode = 2052;


UPDATE isack
SET content = '유화 그리기 클래스에서는 기름 그림의 아름다움과 특유의 광택을 표현하는 기법을 배우며 더욱 섬세한 예술 작품을 창작할 수 있습니다.'
WHERE icode = 2053;
UPDATE isack
SET content = '포토그래피 스튜디오에서는 다양한 주제와 테마에 맞추어 사진을 촬영하며 독창적이고 멋진 사진 작품을 만들 수 있습니다.'
WHERE icode = 2054;

UPDATE isack
SET content = '파빈드 모자이크 클래스에서는 다양한 재료를 활용하여 아름다운 모자이크 아트 작품을 만들며 손으로 창작하는 즐거움을 느낄 수 있습니다.'
WHERE icode = 2055;

UPDATE isack
SET content = '피아노 연주 강습에서는 피아노를 연주하는 기술과 음악적 감성을 향상시키며 아름다운 음악을 연주할 수 있습니다.'
WHERE icode = 2056;

UPDATE isack
SET content = '캘리그라피 워크샵에서는 아름다운 서체와 글씨체를 연습하며 손으로 쓰는 예술적 글씨를 표현할 수 있습니다.'
WHERE icode = 2057;

UPDATE isack
SET content = '동양화 수채화 강습에서는 수채화의 특유의 매력과 기법을 배우며 아름다운 동양화 작품을 창작할 수 있습니다.'
WHERE icode = 2058;

UPDATE isack
SET content = '가죽공예 클래스에서는 다양한 가죽 제작 기술을 익히며 개성있는 가죽 작품을 만들 수 있습니다.'
WHERE icode = 2059;


UPDATE isack
SET content = '남산골한옥마을 전망대에서는 남산의 아름다운 야경을 감상하며 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2040;

UPDATE isack
SET content = '남산서울타워에서는 서울의 야경을 한눈에 감상할 수 있는 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2041;

UPDATE isack
SET content = '국립중앙과학관 천체관층에서는 별들을 관찰하고 천문학적인 이야기를 들을 수 있는 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2042;

UPDATE isack
SET content = '하늘공원은 시원한 하늘과 함께 별들을 감상하며 로맨틱한 데이트를 즐길 수 있는 공원입니다.'
WHERE icode = 2043;

UPDATE isack
SET content = '봉은사와 함께하는 서울빛초롱축제는 환상적인 빛과 별들을 감상할 수 있는 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2044;

UPDATE isack
SET content = '서울 숲 라이프센터에서는 서울의 별들을 감상하며 특별한 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2045;

UPDATE isack
SET content = '대모산 천문대는 밤하늘의 아름다운 별들을 관찰하며 로맨틱한 데이트를 즐길 수 있는 특별한 장소입니다.'
WHERE icode = 2046;

UPDATE isack
SET content = '관악산 전망대에서는 서울의 야경과 함께 별들을 감상하며 특별한 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2047;

UPDATE isack
SET content = '용마폭포공원은 아름다운 폭포와 함께 별들을 감상하며 로맨틱한 데이트를 즐길 수 있는 특별한 장소입니다.'
WHERE icode = 2048;

UPDATE isack
SET content = '한양도성성곽길을 따라 걷며 야경과 함께 별들을 감상하며 특별한 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2049;

UPDATE isack
SET content = '플라워 카페는 아름다운 꽃과 식물들이 있는 편안한 분위기의 카페입니다. 화려한 꽃들과 함께 휴식을 즐길 수 있습니다.'
WHERE icode = 2010;

UPDATE isack
SET content = '북카페는 책과 커피를 함께 즐길 수 있는 공간으로, 다양한 장르의 책들이 있어 독서를 즐기기에 좋은 장소입니다.'
WHERE icode = 2011;

UPDATE isack
SET content = '고양이 카페는 귀여운 고양이와 함께 커피를 마실 수 있는 카페로, 고양이와 소통하며 힐링을 즐길 수 있습니다.'
WHERE icode = 2012;

UPDATE isack
SET content = '게임 카페는 다양한 게임을 즐길 수 있는 장소로, 다양한 게임 기기와 보드 게임 등이 있어 즐거운 시간을 보낼 수 있습니다.'
WHERE icode = 2013;

UPDATE isack
SET content = '로봇 카페는 첨단 로봇 기술을 접할 수 있는 카페로, 다양한 로봇들의 따뜻한 서비스를 경험할 수 있습니다.'
WHERE icode = 2014;

UPDATE isack
SET content = '어반 가든 카페는 도시 속에서 푸른 자연을 느낄 수 있는 카페로, 실내 정원과 그린 인테리어가 인상적입니다.'
WHERE icode = 2015;

UPDATE isack
SET content = '인형 카페는 다양한 테마의 인형과 함께하는 귀여운 카페로, 아기자기한 분위기를 즐길 수 있습니다.'
WHERE icode = 2016;

UPDATE isack
SET content = '뮤지엄 카페는 예술과 문화를 느낄 수 있는 공간으로, 아트워크와 함께 커피를 즐길 수 있습니다.'
WHERE icode = 2017;

UPDATE isack
SET content = '빈티지 카페는 고전적인 분위기와 고급스러운 인테리어가 특징인 카페로, 고즈넉한 분위기를 즐길 수 있습니다.'
WHERE icode = 2018;

UPDATE isack
SET content = '해변 카페는 바다와 함께 즐기는 휴식을 즐길 수 있는 카페로, 파도 소리와 함께 여유로운 시간을 보낼 수 있습니다.'
WHERE icode = 2019;

UPDATE isack
SET content = '한강 자전거길은 한강을 따라 자전거를 타며 풍경을 감상할 수 있는 자전거 경로입니다.'
WHERE icode = 2020;

UPDATE isack
SET content = '북악스카이웨이는 서울의 경관을 한 눈에 볼 수 있는 자전거 도로로, 특히 일몰 시간대에 아름다운 뷰를 즐길 수 있습니다.'
WHERE icode = 2021;

UPDATE isack
SET content = '청계천 자전거로는 서울의 시내를 가로지르는 자전거 도로로, 유럽 강변을 연상시키는 분위기를 느낄 수 있습니다.'
WHERE icode = 2022;

UPDATE isack
SET content = '서울숲 자전거 대여소는 서울숲에서 자전거를 대여하여 숲 속을 돌아다닐 수 있는 장소입니다.'
WHERE icode = 2023;

UPDATE isack
SET content = '월드컵공원 자전거 경로는 월드컵공원 내에서 다양한 라이딩 코스를 즐길 수 있는 공간입니다.'
WHERE icode = 2024;

UPDATE isack
SET content = '올림픽공원 자전거 대여소는 올림픽공원에서 다양한 스포츠와 자연을 함께 느낄 수 있는 자전거 데이트 장소입니다.'
WHERE icode = 2025;

UPDATE isack
SET content = '난지천 자전거길은 한강과 난지한강공원을 연결하는 자전거 도로로, 강변을 따라 편안한 라이딩을 즐길 수 있습니다.'
WHERE icode = 2026;

UPDATE isack
SET content = '동작대교 자전거 도로는 한강을 가로지르는 동작대교 위에서 자전거를 타며 서울의 도심 뷰를 감상할 수 있는 장소입니다.'
WHERE icode = 2027;

UPDATE isack
SET content = '용산 전망대 자전거길은 용산 전망대로 올라가는 도로로, 서울의 야경과 함께 로맨틱한 데이트를 즐길 수 있습니다.'
WHERE icode = 2028;


UPDATE isack
SET content = '아차산 자전거 트레일은 자전거로 아차산을 탐험할 수 있는 트레일로, 자연 속에서 자전거 라이딩을 즐길 수 있습니다.'
WHERE icode = 2029;




drop table fest;

create table fest(
  fcode number(4) primary key,
  fname varchar2(50) not null,
  fplace varchar2(200) not null,
  fdate varchar2(200) not null,
  flong varchar2(200) not null,
  flati varchar2(200) not null,
  fhit number(3) default  0
);

insert into fest values (1234,'아시아프','홍익대학교홍문관','2023.07.25~2023.08.20','126.92501696334516','37.552656671313656',0);
insert into fest values (1111,'노들섬' ,'노들역','월요일정기휴무','126.95797156101354','37.5178222941299',0);
insert into fest values (2154,'서울프린지페스티벌','문화비축기지','2023.08.08~2023.08.27','126.89424299611377','37.57099767474001',0);
insert into fest values (6578,'망우역사문화공원','망우','매일','127.11438573889444','37.598945179462106',0);
insert into fest values (2345,'코엑스아쿠아리움','코엑스몰','연중무휴','127.05870674256873','37.513287638715866',0);
insert into fest values (3456,'남대문시장','남대문시장','일요일휴무','126.97761603767194','37.55912950085624',0);
insert into fest values (5657,'남산타워','남산공원','연중무휴','126.98820233589757','37.55126982851611',0);
insert into fest values (5888,'동대문디자인플라자','동대문역사문화공원역','신정,(설날,추석)당일휴무','127.00990422149577','37.56717710568507',0);
insert into fest values (5959,'다이나믹메이즈','인사동','연중무휴','126.98714634097279','37.571886775305714',0);
insert into fest values (7895,'씨더라이트','홍대','매주일요일정기휴무','126.92548822089688','37.5567272261333',0);
insert into fest values (2589,'T팩토리','홍대','매달 3번째 월요일 정기 휴무','126.92237448264366','37.555366966583',0);
insert into fest values (9852,'테이블에이','홍대','매일','126.92950561935561','37.554067245528024',0);
insert into fest values (6588,'국립중앙박물관','용산','신정,(설날,추석)당일휴무','126.98020019191966','37.52384230661723',0);
insert into fest values (9541,'서울스카이','롯데월드타워서울','매일','127.10260375943304','37.51267876938487',0);
insert into fest values (5555,'쌈지길','인사동','매일','126.98472905704959','37.57434395104887',0);

create sequence users_seq
    increment by 1
    start with 1
    minvalue 1
    maxvalue 9999
    nocycle
    nocache
    noorder;

drop table users;

create table users(
    id varchar2(50) primary key,
    password varchar2(50) ,
    username varchar2(50) ,
    gender varchar2(5),
    age number(4) , 
    user_location varchar2(50) ,
    code number(4),
    fn_number number(10)
);
insert into users values( 'jomin5' , 'comidian' , '조민' , '남' , 21 ,  null , users_seq.nextval , 0 );

drop table board;

CREATE TABLE board (
    num NUMBER(9) NOT NULL PRIMARY KEY,
    name VARCHAR2(20) NOT NULL,
    SUBJECT VARCHAR2(50) NOT NULL,
    CONTENT VARCHAR2(4000) NOT NULL,
    HITCOUNT NUMBER(9),
    CREATED DATE,
    CONSTRAINT fk_board_name FOREIGN KEY (name) REFERENCES users (ID)
);

drop table follow;
create table follow(
name varchar2(200),
following varchar2(200)
);
