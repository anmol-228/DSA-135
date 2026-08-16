# DSA 135

My Java data-structures and algorithms accountability journey — a fixed
135-day plan. This repository contains the exercises, LeetCode solutions,
and notes I actually complete — nothing is filled in merely to make the
repository look finished.

## Current status

**Day 01 / 135.** See [PROGRESS.md](PROGRESS.md) for the human-readable
progress record and [COMPLETED.md](COMPLETED.md) for a verified per-item
breakdown of what's actually done. [CURRICULUM.md](CURRICULUM.md) has the
full 135-day plan.

## Method

- Fixed day-by-day progression: `active_day` is always the earliest
  incomplete curriculum day. The calendar date never auto-advances it — a
  missed day simply stays active until finished, then the next day unlocks
  immediately.
- Java-first practice for language fluency and interview preparation.
- LeetCode work is recorded only after a fresh, genuine Accepted submission
  on leetcode.com — never fabricated, never solved on my behalf.
- Local Java exercises are written, compiled, and tested on my own machine —
  never filled in by an AI.
- Each completed problem includes an explanation, complexity notes,
  assistance level, and Green/Yellow/Red confidence reflection.
- Revisions reinforce solved problems at spaced intervals.
- Primary learning resource: the
  [Love Babbar / CodeHelp DSA playlist](https://www.youtube.com/@CodeHelp).

## Repository structure

```text
Week-01/
  Day-001/
    exercises/   Java fundamentals exercises (skeletons only until solved)
    leetcode/    LCxxxx_ProblemTitle.java files, after genuine completion
    notes.md     Pattern, approach (in my own words), complexity, confidence
Week-02/
  ...
```

A file existing at its canonical path is not, by itself, evidence it's
solved — see [COMPLETED.md](COMPLETED.md) for what's actually verified done.

## Commit style

- `dsa(day-NNN): complete Java exercise — ...`
- `dsa(day-NNN): solve LC...`
- `dsa(day-NNN): complete learn — ...`
- `revision(day-NNN): re-solve LC...`

Commits represent real study work. Local Git preserves the history; GitHub
is the remote copy.

## DSA Accountability

This repository is tracked with
[DSA Accountability](https://github.com/anmol-228/DSA-Accountability), a
Windows desktop app that enforces the day-by-day plan, validates local Java
work, detects genuine LeetCode Accepted submissions, and coordinates
reflections, revisions, and safe Git/GitHub sync.

The application does not solve or submit questions for me. Solutions and
reflections here reflect genuine progress.

## History note

This repository briefly experimented with a flexible topic/session model
(exercises temporarily lived under a `Topics/` directory) before returning
to the original fixed 135-day plan. That history is preserved in Git; the
active structure is the `Week-XX/Day-XXX/` layout above.
