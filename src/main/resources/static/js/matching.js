
let cnt = 1;
let lang_value;
let master_value, loa_value, grade_value, language_class_value, level_value, gpa_value, springStart_value,
    springEnd_value, fallStart_value, fallEnd_value;


function resultbtn() {
    let data = {
        user_name:nextbtn.user_name,
        user_num : nextbtn.user_num,
        lang : lang_value,
        master : master_value,
        loa : loa_value,
        grade : grade_value,
        language_class : language_class_value,
        level : level_value,
        gpa : gpa_value,
        springStart : springStart_value,
        springEnd : springEnd_value,
        fallStart : fallStart_value,
        fallEnd : fallEnd_value,

    };

    $.ajax({
        url: "/setInfo",
        type: "POST",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(data),
        success:function () {
            alert("성공");
        },
        error:function () {
            alert("실패");
        }
    })
}

function nextbtn() {

    //사용자 정보 변수에 담기
    if (cnt == 1) {
        let user_num = document.getElementsByClassName('user_num')[0].value;
        let user_name = document.getElementsByClassName('user_name')[0].value;
        console.log(user_name, user_num);

        // 정보 input 안보이게하고 다음으로
        let q1 = document.getElementById('q1');
        let q2 = document.getElementById('q2');
        q1.style.display = 'none';
        q2.style.display = 'block';

        //이전 버튼 생성
        let prebtn = document.getElementsByClassName('prebtn')[0];
        prebtn.style.display = 'block';

        //cnt증가
        cnt += 1;
        console.log(cnt);
    } else if (cnt == 2) {
        //체크값 가져옴
        langCheck();

        let q2 = document.getElementById('q2');
        let q3 = document.getElementById('q3');
        q2.style.display = 'none';
        q3.style.display = 'block';
        cnt++;

    } else if (cnt == 3) {
        //체크값 가져옴
        masterCheck();

        let q3 = document.getElementById('q3');
        let q4 = document.getElementById('q4');
        q3.style.display = 'none';
        q4.style.display = 'block';
        cnt++;
    } else if (cnt == 4) {
        loaCheck();

        let q4 = document.getElementById('q4');
        let q5 = document.getElementById('q5');
        q4.style.display = 'none';
        q5.style.display = 'block';
        cnt++;
    } else if (cnt == 5) {
        levelCheck();

        let q5 = document.getElementById('q5');
        let q6 = document.getElementById('q6');
        q5.style.display = 'none';
        q6.style.display = 'block';
        cnt++;

    } else if (cnt == 6) {
        gradeCheck();

        let q6 = document.getElementById('q6');
        let q7 = document.getElementById('q7');
        q6.style.display = 'none';
        q7.style.display = 'block';
        cnt++;
    } else if (cnt == 7) {
        fallCheck();
        //제출 버튼 생성
        let resultbtn = document.getElementsByClassName('resultbtn')[0];
        resultbtn.style.display = 'block';

        let q7 = document.getElementById('q7');
        let q8 = document.getElementById('q8');
        q7.style.display = 'none';
        q8.style.display = 'block';

        //다음 버튼 없애기
        let nextbtn = document.getElementsByClassName('nextbtn')[0];
        nextbtn.style.display = 'none';
        cnt++;
    }

}

function prebtn() {
    cnt--;

    //이게 전꺼
    let createContent = 'q' + String(cnt);
    //이게 지금꺼
    let noneContent = 'q' + String(cnt + 1);
    console.log(cnt);
    console.log('create : ', createContent);
    console.log('none : ', noneContent);

    let none_content = document.getElementById(noneContent);
    console.log("none_content : ", none_content);
    none_content.style.display = 'none';

    let blockContent = document.getElementById(createContent);
    blockContent.style.display = 'block';
    console.log("create_content : ", blockContent);

    //이전 질문이 없을 때
    if (cnt == 1) {
        let prebtn = document.getElementsByClassName('prebtn')[0];
        prebtn.style.display = 'none';
    } else if (cnt == 7) {
        let resultbtn = document.getElementsByClassName('resultbtn')[0];
        resultbtn.style.display = 'none';

        let nextbtn = document.getElementsByClassName('nextbtn')[0];
        nextbtn.style.display = 'block';
    }

}

function langCheck() {
    let lang = document.getElementsByName('lang');
    for (let i = 0; i < lang.length; i++) {
        if (lang[i].checked == true) {
            console.log(lang[i].value);
            lang_value = lang[i].value;
        }
    }
}

function masterCheck() {
    let master = document.getElementsByName('master');
    for (let i = 0; i < master.length; i++) {
        if (master[i].checked == true) {
            console.log(master[i].value);
            master_value = master[i].value;
        }
    }
}

function loaCheck() {
    let loa = document.getElementsByName('loa');
    for (let i = 0; i < loa.length; i++) {
        if (loa[i].checked == true) {
            console.log(loa[i].value);
            loa_value = loa[i].value;
        }
    }
}

function levelCheck() {
    let level = document.getElementsByName('level');
    let gpa = document.getElementsByClassName('gpa-input')[0];
    for (let i = 0; i < level.length; i++) {
        if (level[i].checked == true) {
            console.log(level[i].value);
            level_value = level[i].value;
        }
    }
    console.log(gpa.value);
    gpa_value = gpa.value;

}

function gradeCheck() {
    let language_class = document.getElementsByName('language_class');
    let grade = document.getElementsByClassName('grade-input')[0];
    for (let i = 0; i < language_class.length; i++) {
        if (language_class[i].checked == true) {
            console.log(language_class[i].value);
            language_class_value = language_class[i].value;
        }
    }
    console.log(grade.value);
    grade_value = grade.value;
}

function fallCheck() {
    let fallStart = document.getElementsByClassName('fall_start')[0];
    let fallEnd = document.getElementsByClassName('fall_end')[0];
    console.log(fallStart.value);
    console.log(fallEnd.value);
    fallStart_value = fallStart.value;
    fallEnd_value = fallEnd.value;
}

function springCheck() {
    let springStart = document.getElementsByClassName('spring_start')[0];
    let springEnd = document.getElementsByClassName('spring_end')[0];
    console.log(springStart.value);
    console.log(springEnd.value);
    springStart_value = springStart.value;
    springEnd_value = springEnd.value;
}

