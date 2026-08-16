# DSA 135

My Java data-structures and algorithms accountability journey. This repository
contains the exercises, LeetCode solutions, and notes I actually complete —
nothing is filled in merely to make the repository look finished.

## About the name

This repository started as a fixed 135-day plan (hence the name) — see
[CURRICULUM.md](CURRICULUM.md) for that original structure. It's no longer how
I actually study: I now work topic by topic, at my own pace, instead of a
fixed daily schedule. The name stays for repository continuity; the content
follows the current model.

## Current status

See [PROGRESS.md](PROGRESS.md) for the human-readable progress record and
[TOPICS.md](TOPICS.md) for the topic taxonomy this repository is organized
around.

## Method

- Topic-based practice: I pick topics and build a practice session (LeetCode
  problems, local Java exercises, or both) instead of following a fixed
  day-by-day order.
- Java-first practice for language fluency and interview preparation.
- LeetCode-first, with a curated problem bank; the
  [Love Babbar / CodeHelp DSA playlist](https://www.youtube.com/@CodeHelp)
  is my primary learning resource.
- Local exercises are written, compiled, and tested on my machine — never
  filled in by an AI.
- LeetCode work is recorded only after my own fresh Accepted submission.
- Each completed problem includes an explanation, complexity notes, assistance
  level, and Green/Yellow/Red confidence reflection.
- Revisions reinforce solved problems at spaced intervals.
- Per-topic mastery is tracked from real evidence (solves, exercises,
  reflections) — a status change requires both a score threshold and a
  minimum evidence count, so one lucky solve is never "interview ready."

## Repository structure

```text
Topics/
└── <Topic-Name>/
    ├── exercises/    # Java exercise skeletons and completed solutions
    ├── leetcode/     # LCxxxx_ProblemTitle.java after genuine completion
    └── notes.md      # Learning notes and reflections
```

Topic directories are created as genuine work reaches them — not pre-created
empty as if they were already in progress. A problem existing in the curated
bank ([TOPICS.md](TOPICS.md)) does not mean it's solved; see
[PROGRESS.md](PROGRESS.md) for what's actually done.

The original `Week-XX/Day-XXX/` structure still holds any already-completed
work from before the topic-based switch, preserved as-is (see
[CURRICULUM.md](CURRICULUM.md)) — new work goes under `Topics/`.

## Commit style

- `dsa(<topic>): complete Java exercise — ...`
- `dsa(<topic>): solve LC...`
- `revision(<topic>): re-solve LC...`

Commits represent real study work. Local Git preserves the history; GitHub is
the remote copy.

## DSA Accountability

This repository is tracked with
[DSA Accountability](https://github.com/anmol-228/DSA-Accountability), a
Windows desktop app that lets me build topic-based practice sessions,
validates local Java work, detects genuine LeetCode Accepted submissions,
and coordinates reflections, revisions, and safe Git/GitHub sync.

The application does not solve or submit questions for me. Solutions and
reflections here reflect genuine progress.
